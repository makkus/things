/*
 * Things
 *
 * Copyright (c) 2014, Markus Binsteiner. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */

package things.thing;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import things.exceptions.TypeRuntimeException;
import things.types.TypeRegistry;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Map;
import java.util.Set;

/**
 * Project: things-to-build
 * <p>
 * Written by: Markus Binsteiner
 * Date: 23/04/14
 * Time: 10:22 AM
 */
@Component
@Singleton
public class ThingUtils {

    private ObjectMapper objectMapper;

    private ImmutableMap<String, JsonSchema> schemaMap = null;
    //    private ThingsObjectMapper tom;
    private ThingControl tc;
    private TypeRegistry tr;
    private ImmutableMap<String, Map<String, String>> typePropertiesMap = null;

    public ThingUtils() {
    }

    /**
     * Returns a list of all types that where registered on startup (by being annotated
     * with the {@link things.model.types.Value} annotation).
     *
     * @return the list of types
     */
    public Set<String> getAllRegisteredTypes() {
        return tr.getAllTypes();
    }

//    @Inject
//    public void setThingsObjectMapper(ThingsObjectMapper tom) {
//        this.tom = tom;
//    }

    public Map<String, Map<String, String>> getRegisteredTypeProperties() {

        if ( typePropertiesMap == null ) {
            Map<String, Map<String, String>> temp = Maps.newTreeMap();
            for ( String type : tr.getAllTypes() ) {
                Class typeClass = tr.getTypeClass(type);
                BeanInfo info = null;
                try {
                    info = Introspector.getBeanInfo(typeClass);
                } catch (IntrospectionException e) {
                    throw new TypeRuntimeException("Can't generate info for type: " + type, type, e);
                }

                Map<String, String> properties = Maps.newTreeMap();

                for ( PropertyDescriptor desc : info.getPropertyDescriptors() ) {
                    String name = desc.getName();
                    if ( "class".equals(name) || "id".equals(name) ) {
                        continue;
                    }
                    Class propClass = desc.getPropertyType();
                    properties.put(name, propClass.getSimpleName());
                }
                temp.put(type, properties);
            }
            typePropertiesMap = ImmutableMap.copyOf(temp);
        }
        return typePropertiesMap;

    }

    public Map<String, JsonSchema> getRegisteredTypeSchemata() {

        if ( schemaMap == null ) {
            Map<String, JsonSchema> temp = Maps.newTreeMap();
            for ( String type : tr.getAllTypes() ) {
                Class typeClass = tr.getTypeClass(type);

                SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
                try {
                    objectMapper.acceptJsonFormatVisitor(objectMapper.constructType(typeClass), visitor);
                } catch (JsonMappingException e) {
                    throw new TypeRuntimeException("Can't get schema for type: " + type, type, e);
                }
                JsonSchema jsonSchema = visitor.finalSchema();
                temp.put(type, jsonSchema);
            }
            schemaMap = ImmutableMap.copyOf(temp);
        }
        return schemaMap;
    }

    @Inject
    public void setThingControl(ThingControl tc) {
        this.tc = tc;
    }

    @Inject
    public void setTypeRegistry(TypeRegistry tr) {
        this.tr = tr;
    }


}
