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
 * <p>
 * Holds the main information about projects
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.ProjectRecord, projectdb.tables.pojos.Project, java.lang.Integer> {

    /**
     * Create a new ProjectDao without any configuration
     */
    public ProjectDao() {
        super(projectdb.tables.Project.PROJECT, projectdb.tables.pojos.Project.class);
    }

    /**
     * Create a new ProjectDao with an attached configuration
     */
    public ProjectDao(org.jooq.Configuration configuration) {
        super(projectdb.tables.Project.PROJECT, projectdb.tables.pojos.Project.class, configuration);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByDescription(java.lang.String... values) {
        return fetch(projectdb.tables.Project.PROJECT.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>endDate IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByEnddate(java.lang.String... values) {
        return fetch(projectdb.tables.Project.PROJECT.ENDDATE, values);
    }

    /**
     * Fetch records that have <code>hostInstitution IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByHostinstitution(java.lang.String... values) {
        return fetch(projectdb.tables.Project.PROJECT.HOSTINSTITUTION, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchById(java.lang.Integer... values) {
        return fetch(projectdb.tables.Project.PROJECT.ID, values);
    }

    /**
     * Fetch records that have <code>lastModified IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByLastmodified(java.sql.Timestamp... values) {
        return fetch(projectdb.tables.Project.PROJECT.LASTMODIFIED, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByName(java.lang.String... values) {
        return fetch(projectdb.tables.Project.PROJECT.NAME, values);
    }

    /**
     * Fetch records that have <code>nextFollowUpDate IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByNextfollowupdate(java.lang.String... values) {
        return fetch(projectdb.tables.Project.PROJECT.NEXTFOLLOWUPDATE, values);
    }

    /**
     * Fetch records that have <code>nextReviewDate IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByNextreviewdate(java.lang.String... values) {
        return fetch(projectdb.tables.Project.PROJECT.NEXTREVIEWDATE, values);
    }

    /**
     * Fetch records that have <code>notes IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByNotes(java.lang.String... values) {
        return fetch(projectdb.tables.Project.PROJECT.NOTES, values);
    }

    /**
     * Fetch records that have <code>projectCode IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByProjectcode(java.lang.String... values) {
        return fetch(projectdb.tables.Project.PROJECT.PROJECTCODE, values);
    }

    /**
     * Fetch records that have <code>projectTypeId IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByProjecttypeid(java.lang.Integer... values) {
        return fetch(projectdb.tables.Project.PROJECT.PROJECTTYPEID, values);
    }

    /**
     * Fetch records that have <code>requirements IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByRequirements(java.lang.String... values) {
        return fetch(projectdb.tables.Project.PROJECT.REQUIREMENTS, values);
    }

    /**
     * Fetch records that have <code>startDate IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByStartdate(java.lang.String... values) {
        return fetch(projectdb.tables.Project.PROJECT.STARTDATE, values);
    }

    /**
     * Fetch records that have <code>statusId IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByStatusid(java.lang.Integer... values) {
        return fetch(projectdb.tables.Project.PROJECT.STATUSID, values);
    }

    /**
     * Fetch records that have <code>todo IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Project> fetchByTodo(java.lang.String... values) {
        return fetch(projectdb.tables.Project.PROJECT.TODO, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projectdb.tables.pojos.Project fetchOneById(java.lang.Integer value) {
        return fetchOne(projectdb.tables.Project.PROJECT.ID, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected java.lang.Integer getId(projectdb.tables.pojos.Project object) {
        return object.getId();
    }
}
