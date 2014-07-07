package things.types;

import java.util.Collection;
import java.util.Set;

/**
 * Created by markus on 7/07/14.
 */
public interface TypeRegistry {
    Boolean equals(Class typeClass, String thingType);

    Boolean equals(String thingType, Class typeClass);

    Boolean equals(String type, Object value);

    Boolean equals(Object value, String type);

    Boolean equals(Class typeClass, Object value);

    Boolean equals(Object value, Class typeClass);

    Collection<ThingType<?>> getAllThingTypes();

    Set<String> getAllTypes();

    ThingType getThingType(Class<?> type);

    ThingType getThingType(String type);

    ThingType getThingType(Object value);

    String getType(Class<?> typeClass);

    String getType(Object value);

    Class<?> getTypeClass(String type);

    Class<?> getTypeClass(Object value);
}
