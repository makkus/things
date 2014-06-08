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
 * <p>
 * NeSI and CeR staff
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Adviser implements java.io.Serializable {

    private static final long serialVersionUID = -469642654;
    private java.lang.String address;
    private java.lang.String department;
    private java.lang.String division;
    private java.lang.String email;
    private java.lang.String enddate;
    private java.lang.String fullname;
    private java.lang.Integer id;
    private java.lang.String institution;
    private java.lang.Byte isadmin;
    private java.sql.Timestamp lastmodified;
    private java.lang.String notes;
    private java.lang.String phone;
    private java.lang.String pictureurl;
    private java.lang.String startdate;
    private java.lang.String tuakiritoken;
    private java.lang.String tuakiriuniqueid;

    public Adviser() {
    }

    public Adviser(
            java.lang.Integer id,
            java.lang.String fullname,
            java.lang.String email,
            java.lang.String phone,
            java.lang.String address,
            java.lang.String institution,
            java.lang.String division,
            java.lang.String department,
            java.lang.String pictureurl,
            java.lang.String startdate,
            java.lang.String enddate,
            java.lang.String notes,
            java.lang.Byte isadmin,
            java.lang.String tuakiriuniqueid,
            java.lang.String tuakiritoken,
            java.sql.Timestamp lastmodified
    ) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.institution = institution;
        this.division = division;
        this.department = department;
        this.pictureurl = pictureurl;
        this.startdate = startdate;
        this.enddate = enddate;
        this.notes = notes;
        this.isadmin = isadmin;
        this.tuakiriuniqueid = tuakiriuniqueid;
        this.tuakiritoken = tuakiritoken;
        this.lastmodified = lastmodified;
    }

    public java.lang.String getAddress() {
        return this.address;
    }

    public java.lang.String getDepartment() {
        return this.department;
    }

    public java.lang.String getDivision() {
        return this.division;
    }

    public java.lang.String getEmail() {
        return this.email;
    }

    public java.lang.String getEnddate() {
        return this.enddate;
    }

    public java.lang.String getFullname() {
        return this.fullname;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public java.lang.String getInstitution() {
        return this.institution;
    }

    public java.lang.Byte getIsadmin() {
        return this.isadmin;
    }

    public java.sql.Timestamp getLastmodified() {
        return this.lastmodified;
    }

    public java.lang.String getNotes() {
        return this.notes;
    }

    public java.lang.String getPhone() {
        return this.phone;
    }

    public java.lang.String getPictureurl() {
        return this.pictureurl;
    }

    public java.lang.String getStartdate() {
        return this.startdate;
    }

    public java.lang.String getTuakiritoken() {
        return this.tuakiritoken;
    }

    public java.lang.String getTuakiriuniqueid() {
        return this.tuakiriuniqueid;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public void setDepartment(java.lang.String department) {
        this.department = department;
    }

    public void setDivision(java.lang.String division) {
        this.division = division;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public void setEnddate(java.lang.String enddate) {
        this.enddate = enddate;
    }

    public void setFullname(java.lang.String fullname) {
        this.fullname = fullname;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public void setInstitution(java.lang.String institution) {
        this.institution = institution;
    }

    public void setIsadmin(java.lang.Byte isadmin) {
        this.isadmin = isadmin;
    }

    public void setLastmodified(java.sql.Timestamp lastmodified) {
        this.lastmodified = lastmodified;
    }

    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    public void setPictureurl(java.lang.String pictureurl) {
        this.pictureurl = pictureurl;
    }

    public void setStartdate(java.lang.String startdate) {
        this.startdate = startdate;
    }

    public void setTuakiritoken(java.lang.String tuakiritoken) {
        this.tuakiritoken = tuakiritoken;
    }

    public void setTuakiriuniqueid(java.lang.String tuakiriuniqueid) {
        this.tuakiriuniqueid = tuakiriuniqueid;
    }
}
