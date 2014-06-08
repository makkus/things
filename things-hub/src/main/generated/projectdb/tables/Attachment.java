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
package projectdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Attachment extends org.jooq.impl.TableImpl<projectdb.tables.records.AttachmentRecord> {

    /**
     * The singleton instance of <code>projectdb.attachment</code>
     */
    public static final projectdb.tables.Attachment ATTACHMENT = new projectdb.tables.Attachment();
    private static final long serialVersionUID = -843321312;
    /**
     * The column <code>projectdb.attachment.adviserActionId</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.AttachmentRecord, java.lang.Integer> ADVISERACTIONID = createField("adviserActionId", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>projectdb.attachment.date</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.AttachmentRecord, java.lang.String> DATE = createField("date", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");
    /**
     * The column <code>projectdb.attachment.description</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.AttachmentRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");
    /**
     * The column <code>projectdb.attachment.followupId</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.AttachmentRecord, java.lang.Integer> FOLLOWUPID = createField("followupId", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>projectdb.attachment.id</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.AttachmentRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>projectdb.attachment.link</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.AttachmentRecord, java.lang.String> LINK = createField("link", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");
    /**
     * The column <code>projectdb.attachment.projectId</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.AttachmentRecord, java.lang.Integer> PROJECTID = createField("projectId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>projectdb.attachment.reviewId</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.AttachmentRecord, java.lang.Integer> REVIEWID = createField("reviewId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>projectdb.attachment</code> table reference
     */
    public Attachment() {
        this("attachment", null);
    }

    /**
     * Create an aliased <code>projectdb.attachment</code> table reference
     */
    public Attachment(java.lang.String alias) {
        this(alias, projectdb.tables.Attachment.ATTACHMENT);
    }

    private Attachment(java.lang.String alias, org.jooq.Table<projectdb.tables.records.AttachmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Attachment(java.lang.String alias, org.jooq.Table<projectdb.tables.records.AttachmentRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, projectdb.Projectdb.PROJECTDB, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public projectdb.tables.Attachment as(java.lang.String alias) {
        return new projectdb.tables.Attachment(alias, this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Identity<projectdb.tables.records.AttachmentRecord, java.lang.Integer> getIdentity() {
        return projectdb.Keys.IDENTITY_ATTACHMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.UniqueKey<projectdb.tables.records.AttachmentRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<projectdb.tables.records.AttachmentRecord>>asList(projectdb.Keys.KEY_ATTACHMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.UniqueKey<projectdb.tables.records.AttachmentRecord> getPrimaryKey() {
        return projectdb.Keys.KEY_ATTACHMENT_PRIMARY;
    }

    /**
     * The class holding records for this type
     */
    @Override
    public java.lang.Class<projectdb.tables.records.AttachmentRecord> getRecordType() {
        return projectdb.tables.records.AttachmentRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.ForeignKey<projectdb.tables.records.AttachmentRecord, ?>> getReferences() {
        return java.util.Arrays.<org.jooq.ForeignKey<projectdb.tables.records.AttachmentRecord, ?>>asList(projectdb.Keys.ATTACHMENT_IBFK_1, projectdb.Keys.ATTACHMENT_IBFK_2, projectdb.Keys.ATTACHMENT_IBFK_3, projectdb.Keys.ATTACHMENT_IBFK_4);
    }

    /**
     * Rename this table
     */
    public projectdb.tables.Attachment rename(java.lang.String name) {
        return new projectdb.tables.Attachment(name, null);
    }
}
