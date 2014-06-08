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

/**
 * This class is generated by jOOQ
 */
package projectdb.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectPropertiesDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.ProjectPropertiesRecord, projectdb.tables.pojos.ProjectProperties, java.lang.Integer> {

    /**
     * Create a new ProjectPropertiesDao without any configuration
     */
    public ProjectPropertiesDao() {
        super(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES, projectdb.tables.pojos.ProjectProperties.class);
    }

    /**
     * Create a new ProjectPropertiesDao with an attached configuration
     */
    public ProjectPropertiesDao(org.jooq.Configuration configuration) {
        super(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES, projectdb.tables.pojos.ProjectProperties.class, configuration);
    }

    /**
     * Fetch records that have <code>facilityId IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchByFacilityid(java.lang.Integer... values) {
        return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.FACILITYID, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchById(java.lang.Integer... values) {
        return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.ID, values);
    }

    /**
     * Fetch records that have <code>projectId IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchByProjectid(java.lang.Integer... values) {
        return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROJECTID, values);
    }

    /**
     * Fetch records that have <code>propname IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchByPropname(java.lang.String... values) {
        return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROPNAME, values);
    }

    /**
     * Fetch records that have <code>propvalue IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchByPropvalue(java.lang.String... values) {
        return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROPVALUE, values);
    }

    /**
     * Fetch records that have <code>timestamp IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchByTimestamp(java.sql.Timestamp... values) {
        return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.TIMESTAMP, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projectdb.tables.pojos.ProjectProperties fetchOneById(java.lang.Integer value) {
        return fetchOne(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.ID, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected java.lang.Integer getId(projectdb.tables.pojos.ProjectProperties object) {
        return object.getId();
    }
}
