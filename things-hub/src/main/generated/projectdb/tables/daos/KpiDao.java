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
 * Key Performance Indicators (for us).
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class KpiDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.KpiRecord, projectdb.tables.pojos.Kpi, java.lang.Integer> {

    /**
     * Create a new KpiDao without any configuration
     */
    public KpiDao() {
        super(projectdb.tables.Kpi.KPI, projectdb.tables.pojos.Kpi.class);
    }

    /**
     * Create a new KpiDao with an attached configuration
     */
    public KpiDao(org.jooq.Configuration configuration) {
        super(projectdb.tables.Kpi.KPI, projectdb.tables.pojos.Kpi.class, configuration);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Kpi> fetchById(java.lang.Integer... values) {
        return fetch(projectdb.tables.Kpi.KPI.ID, values);
    }

    /**
     * Fetch records that have <code>measures IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Kpi> fetchByMeasures(java.lang.String... values) {
        return fetch(projectdb.tables.Kpi.KPI.MEASURES, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Kpi> fetchByTitle(java.lang.String... values) {
        return fetch(projectdb.tables.Kpi.KPI.TITLE, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Kpi> fetchByType(java.lang.String... values) {
        return fetch(projectdb.tables.Kpi.KPI.TYPE, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projectdb.tables.pojos.Kpi fetchOneById(java.lang.Integer value) {
        return fetchOne(projectdb.tables.Kpi.KPI.ID, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected java.lang.Integer getId(projectdb.tables.pojos.Kpi object) {
        return object.getId();
    }
}
