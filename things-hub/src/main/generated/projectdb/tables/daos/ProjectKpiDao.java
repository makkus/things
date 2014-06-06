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
public class ProjectKpiDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.ProjectKpiRecord, projectdb.tables.pojos.ProjectKpi, java.lang.Integer> {

    /**
     * Create a new ProjectKpiDao without any configuration
     */
    public ProjectKpiDao() {
        super(projectdb.tables.ProjectKpi.PROJECT_KPI, projectdb.tables.pojos.ProjectKpi.class);
    }

    /**
     * Create a new ProjectKpiDao with an attached configuration
     */
    public ProjectKpiDao(org.jooq.Configuration configuration) {
        super(projectdb.tables.ProjectKpi.PROJECT_KPI, projectdb.tables.pojos.ProjectKpi.class, configuration);
    }

    /**
     * Fetch records that have <code>adviserId IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectKpi> fetchByAdviserid(java.lang.Integer... values) {
        return fetch(projectdb.tables.ProjectKpi.PROJECT_KPI.ADVISERID, values);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectKpi> fetchByCode(java.lang.Integer... values) {
        return fetch(projectdb.tables.ProjectKpi.PROJECT_KPI.CODE, values);
    }

    /**
     * Fetch records that have <code>date IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectKpi> fetchByDate(java.lang.String... values) {
        return fetch(projectdb.tables.ProjectKpi.PROJECT_KPI.DATE, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectKpi> fetchById(java.lang.Integer... values) {
        return fetch(projectdb.tables.ProjectKpi.PROJECT_KPI.ID, values);
    }

    /**
     * Fetch records that have <code>kpiId IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectKpi> fetchByKpiid(java.lang.Integer... values) {
        return fetch(projectdb.tables.ProjectKpi.PROJECT_KPI.KPIID, values);
    }

    /**
     * Fetch records that have <code>notes IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectKpi> fetchByNotes(java.lang.String... values) {
        return fetch(projectdb.tables.ProjectKpi.PROJECT_KPI.NOTES, values);
    }

    /**
     * Fetch records that have <code>projectId IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectKpi> fetchByProjectid(java.lang.Integer... values) {
        return fetch(projectdb.tables.ProjectKpi.PROJECT_KPI.PROJECTID, values);
    }

    /**
     * Fetch records that have <code>value IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectKpi> fetchByValue(java.lang.Double... values) {
        return fetch(projectdb.tables.ProjectKpi.PROJECT_KPI.VALUE, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projectdb.tables.pojos.ProjectKpi fetchOneById(java.lang.Integer value) {
        return fetchOne(projectdb.tables.ProjectKpi.PROJECT_KPI.ID, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected java.lang.Integer getId(projectdb.tables.pojos.ProjectKpi object) {
        return object.getId();
    }
}