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
public class ProjectStatusDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.ProjectStatusRecord, projectdb.tables.pojos.ProjectStatus, java.lang.Integer> {

    /**
     * Create a new ProjectStatusDao without any configuration
     */
    public ProjectStatusDao() {
        super(projectdb.tables.ProjectStatus.PROJECT_STATUS, projectdb.tables.pojos.ProjectStatus.class);
    }

    /**
     * Create a new ProjectStatusDao with an attached configuration
     */
    public ProjectStatusDao(org.jooq.Configuration configuration) {
        super(projectdb.tables.ProjectStatus.PROJECT_STATUS, projectdb.tables.pojos.ProjectStatus.class, configuration);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectStatus> fetchById(java.lang.Integer... values) {
        return fetch(projectdb.tables.ProjectStatus.PROJECT_STATUS.ID, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.ProjectStatus> fetchByName(java.lang.String... values) {
        return fetch(projectdb.tables.ProjectStatus.PROJECT_STATUS.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projectdb.tables.pojos.ProjectStatus fetchOneById(java.lang.Integer value) {
        return fetchOne(projectdb.tables.ProjectStatus.PROJECT_STATUS.ID, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected java.lang.Integer getId(projectdb.tables.pojos.ProjectStatus object) {
        return object.getId();
    }
}
