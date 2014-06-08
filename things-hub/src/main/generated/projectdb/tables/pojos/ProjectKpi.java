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
package projectdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectKpi implements java.io.Serializable {

    private static final long serialVersionUID = 2041203551;
    private java.lang.Integer adviserid;
    private java.lang.Integer code;
    private java.lang.String date;
    private java.lang.Integer id;
    private java.lang.Integer kpiid;
    private java.lang.String notes;
    private java.lang.Integer projectid;
    private java.lang.Double value;

    public ProjectKpi() {
    }

    public ProjectKpi(
            java.lang.Integer id,
            java.lang.Integer kpiid,
            java.lang.Integer projectid,
            java.lang.String date,
            java.lang.Integer adviserid,
            java.lang.Double value,
            java.lang.String notes,
            java.lang.Integer code
    ) {
        this.id = id;
        this.kpiid = kpiid;
        this.projectid = projectid;
        this.date = date;
        this.adviserid = adviserid;
        this.value = value;
        this.notes = notes;
        this.code = code;
    }

    public java.lang.Integer getAdviserid() {
        return this.adviserid;
    }

    public java.lang.Integer getCode() {
        return this.code;
    }

    public java.lang.String getDate() {
        return this.date;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public java.lang.Integer getKpiid() {
        return this.kpiid;
    }

    public java.lang.String getNotes() {
        return this.notes;
    }

    public java.lang.Integer getProjectid() {
        return this.projectid;
    }

    public java.lang.Double getValue() {
        return this.value;
    }

    public void setAdviserid(java.lang.Integer adviserid) {
        this.adviserid = adviserid;
    }

    public void setCode(java.lang.Integer code) {
        this.code = code;
    }

    public void setDate(java.lang.String date) {
        this.date = date;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public void setKpiid(java.lang.Integer kpiid) {
        this.kpiid = kpiid;
    }

    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    public void setProjectid(java.lang.Integer projectid) {
        this.projectid = projectid;
    }

    public void setValue(java.lang.Double value) {
        this.value = value;
    }
}
