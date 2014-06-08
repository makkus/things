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
package projectdb.tables.records;

/**
 * This class is generated by jOOQ.
 * <p>
 * Holds the main information about projects
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectRecord extends org.jooq.impl.UpdatableRecordImpl<projectdb.tables.records.ProjectRecord> implements org.jooq.Record15<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp> {

    private static final long serialVersionUID = 737405332;

    /**
     * Create a detached ProjectRecord
     */
    public ProjectRecord() {
        super(projectdb.tables.Project.PROJECT);
    }

    /**
     * Create a detached, initialised ProjectRecord
     */
    public ProjectRecord(java.lang.Integer id, java.lang.String projectcode, java.lang.Integer projecttypeid, java.lang.String name, java.lang.String description, java.lang.String hostinstitution, java.lang.String startdate, java.lang.String nextreviewdate, java.lang.String nextfollowupdate, java.lang.String enddate, java.lang.String requirements, java.lang.String notes, java.lang.String todo, java.lang.Integer statusid, java.sql.Timestamp lastmodified) {
        super(projectdb.tables.Project.PROJECT);

        setValue(0, id);
        setValue(1, projectcode);
        setValue(2, projecttypeid);
        setValue(3, name);
        setValue(4, description);
        setValue(5, hostinstitution);
        setValue(6, startdate);
        setValue(7, nextreviewdate);
        setValue(8, nextfollowupdate);
        setValue(9, enddate);
        setValue(10, requirements);
        setValue(11, notes);
        setValue(12, todo);
        setValue(13, statusid);
        setValue(14, lastmodified);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return projectdb.tables.Project.PROJECT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field10() {
        return projectdb.tables.Project.PROJECT.ENDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field11() {
        return projectdb.tables.Project.PROJECT.REQUIREMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field12() {
        return projectdb.tables.Project.PROJECT.NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field13() {
        return projectdb.tables.Project.PROJECT.TODO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field14() {
        return projectdb.tables.Project.PROJECT.STATUSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.sql.Timestamp> field15() {
        return projectdb.tables.Project.PROJECT.LASTMODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field2() {
        return projectdb.tables.Project.PROJECT.PROJECTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field3() {
        return projectdb.tables.Project.PROJECT.PROJECTTYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field4() {
        return projectdb.tables.Project.PROJECT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field5() {
        return projectdb.tables.Project.PROJECT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field6() {
        return projectdb.tables.Project.PROJECT.HOSTINSTITUTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field7() {
        return projectdb.tables.Project.PROJECT.STARTDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field8() {
        return projectdb.tables.Project.PROJECT.NEXTREVIEWDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field9() {
        return projectdb.tables.Project.PROJECT.NEXTFOLLOWUPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row15<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp> fieldsRow() {
        return (org.jooq.Row15) super.fieldsRow();
    }

    /**
     * Getter for <code>projectdb.project.description</code>.
     */
    public java.lang.String getDescription() {
        return (java.lang.String) getValue(4);
    }

    /**
     * Getter for <code>projectdb.project.endDate</code>.
     */
    public java.lang.String getEnddate() {
        return (java.lang.String) getValue(9);
    }

    /**
     * Getter for <code>projectdb.project.hostInstitution</code>.
     */
    public java.lang.String getHostinstitution() {
        return (java.lang.String) getValue(5);
    }

    /**
     * Getter for <code>projectdb.project.id</code>.
     */
    public java.lang.Integer getId() {
        return (java.lang.Integer) getValue(0);
    }

    /**
     * Getter for <code>projectdb.project.lastModified</code>. A unix timestamp indicating the last time the project was edited
     */
    public java.sql.Timestamp getLastmodified() {
        return (java.sql.Timestamp) getValue(14);
    }

    /**
     * Getter for <code>projectdb.project.name</code>.
     */
    public java.lang.String getName() {
        return (java.lang.String) getValue(3);
    }

    /**
     * Getter for <code>projectdb.project.nextFollowUpDate</code>.
     */
    public java.lang.String getNextfollowupdate() {
        return (java.lang.String) getValue(8);
    }

    /**
     * Getter for <code>projectdb.project.nextReviewDate</code>.
     */
    public java.lang.String getNextreviewdate() {
        return (java.lang.String) getValue(7);
    }

    /**
     * Getter for <code>projectdb.project.notes</code>.
     */
    public java.lang.String getNotes() {
        return (java.lang.String) getValue(11);
    }

    /**
     * Getter for <code>projectdb.project.projectCode</code>.
     */
    public java.lang.String getProjectcode() {
        return (java.lang.String) getValue(1);
    }

    /**
     * Getter for <code>projectdb.project.projectTypeId</code>.
     */
    public java.lang.Integer getProjecttypeid() {
        return (java.lang.Integer) getValue(2);
    }

    /**
     * Getter for <code>projectdb.project.requirements</code>.
     */
    public java.lang.String getRequirements() {
        return (java.lang.String) getValue(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>projectdb.project.startDate</code>.
     */
    public java.lang.String getStartdate() {
        return (java.lang.String) getValue(6);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>projectdb.project.statusId</code>.
     */
    public java.lang.Integer getStatusid() {
        return (java.lang.Integer) getValue(13);
    }

    /**
     * Getter for <code>projectdb.project.todo</code>.
     */
    public java.lang.String getTodo() {
        return (java.lang.String) getValue(12);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    /**
     * Setter for <code>projectdb.project.description</code>.
     */
    public void setDescription(java.lang.String value) {
        setValue(4, value);
    }

    /**
     * Setter for <code>projectdb.project.endDate</code>.
     */
    public void setEnddate(java.lang.String value) {
        setValue(9, value);
    }

    /**
     * Setter for <code>projectdb.project.hostInstitution</code>.
     */
    public void setHostinstitution(java.lang.String value) {
        setValue(5, value);
    }

    /**
     * Setter for <code>projectdb.project.id</code>.
     */
    public void setId(java.lang.Integer value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>projectdb.project.lastModified</code>. A unix timestamp indicating the last time the project was edited
     */
    public void setLastmodified(java.sql.Timestamp value) {
        setValue(14, value);
    }

    /**
     * Setter for <code>projectdb.project.name</code>.
     */
    public void setName(java.lang.String value) {
        setValue(3, value);
    }

    /**
     * Setter for <code>projectdb.project.nextFollowUpDate</code>.
     */
    public void setNextfollowupdate(java.lang.String value) {
        setValue(8, value);
    }

    /**
     * Setter for <code>projectdb.project.nextReviewDate</code>.
     */
    public void setNextreviewdate(java.lang.String value) {
        setValue(7, value);
    }

    /**
     * Setter for <code>projectdb.project.notes</code>.
     */
    public void setNotes(java.lang.String value) {
        setValue(11, value);
    }

    /**
     * Setter for <code>projectdb.project.projectCode</code>.
     */
    public void setProjectcode(java.lang.String value) {
        setValue(1, value);
    }

    /**
     * Setter for <code>projectdb.project.projectTypeId</code>.
     */
    public void setProjecttypeid(java.lang.Integer value) {
        setValue(2, value);
    }

    /**
     * Setter for <code>projectdb.project.requirements</code>.
     */
    public void setRequirements(java.lang.String value) {
        setValue(10, value);
    }

    /**
     * Setter for <code>projectdb.project.startDate</code>.
     */
    public void setStartdate(java.lang.String value) {
        setValue(6, value);
    }

    /**
     * Setter for <code>projectdb.project.statusId</code>.
     */
    public void setStatusid(java.lang.Integer value) {
        setValue(13, value);
    }

    /**
     * Setter for <code>projectdb.project.todo</code>.
     */
    public void setTodo(java.lang.String value) {
        setValue(12, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value1(java.lang.Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value10() {
        return getEnddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value10(java.lang.String value) {
        setEnddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value11() {
        return getRequirements();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value11(java.lang.String value) {
        setRequirements(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value12() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value12(java.lang.String value) {
        setNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value13() {
        return getTodo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value13(java.lang.String value) {
        setTodo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value14() {
        return getStatusid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value14(java.lang.Integer value) {
        setStatusid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.sql.Timestamp value15() {
        return getLastmodified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value15(java.sql.Timestamp value) {
        setLastmodified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value2() {
        return getProjectcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value2(java.lang.String value) {
        setProjectcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value3() {
        return getProjecttypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value3(java.lang.Integer value) {
        setProjecttypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value4(java.lang.String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value5(java.lang.String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value6() {
        return getHostinstitution();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value6(java.lang.String value) {
        setHostinstitution(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value7() {
        return getStartdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value7(java.lang.String value) {
        setStartdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value8() {
        return getNextreviewdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value8(java.lang.String value) {
        setNextreviewdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value9() {
        return getNextfollowupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord value9(java.lang.String value) {
        setNextfollowupdate(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.lang.String value12, java.lang.String value13, java.lang.Integer value14, java.sql.Timestamp value15) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row15<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp> valuesRow() {
        return (org.jooq.Row15) super.valuesRow();
    }
}
