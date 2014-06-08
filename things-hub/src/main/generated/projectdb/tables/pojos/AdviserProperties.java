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
public class AdviserProperties implements java.io.Serializable {

    private static final long serialVersionUID = -916556071;
    private java.lang.Integer adviserid;
    private java.lang.Integer id;
    private java.lang.String propname;
    private java.lang.String propvalue;
    private java.lang.Integer siteid;
    private java.sql.Timestamp timestamp;

    public AdviserProperties() {
    }

    public AdviserProperties(
            java.lang.Integer id,
            java.lang.Integer adviserid,
            java.lang.Integer siteid,
            java.lang.String propname,
            java.lang.String propvalue,
            java.sql.Timestamp timestamp
    ) {
        this.id = id;
        this.adviserid = adviserid;
        this.siteid = siteid;
        this.propname = propname;
        this.propvalue = propvalue;
        this.timestamp = timestamp;
    }

    public java.lang.Integer getAdviserid() {
        return this.adviserid;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public java.lang.String getPropname() {
        return this.propname;
    }

    public java.lang.String getPropvalue() {
        return this.propvalue;
    }

    public java.lang.Integer getSiteid() {
        return this.siteid;
    }

    public java.sql.Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setAdviserid(java.lang.Integer adviserid) {
        this.adviserid = adviserid;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public void setPropname(java.lang.String propname) {
        this.propname = propname;
    }

    public void setPropvalue(java.lang.String propvalue) {
        this.propvalue = propvalue;
    }

    public void setSiteid(java.lang.Integer siteid) {
        this.siteid = siteid;
    }

    public void setTimestamp(java.sql.Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
