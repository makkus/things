/**
 * This class is generated by jOOQ
 */
package projectdb.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectPropertiesDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.ProjectPropertiesRecord, projectdb.tables.pojos.ProjectProperties, Integer> {

	/**
	 * Create a new ProjectPropertiesDao without any panAuditConfiguration
	 */
	public ProjectPropertiesDao() {
		super(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES, projectdb.tables.pojos.ProjectProperties.class);
	}

	/**
	 * Create a new ProjectPropertiesDao with an attached panAuditConfiguration
	 */
	public ProjectPropertiesDao(org.jooq.Configuration configuration) {
		super(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES, projectdb.tables.pojos.ProjectProperties.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(projectdb.tables.pojos.ProjectProperties object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchById(Integer... values) {
		return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public projectdb.tables.pojos.ProjectProperties fetchOneById(Integer value) {
		return fetchOne(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.ID, value);
	}

	/**
	 * Fetch records that have <code>projectId IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchByProjectid(Integer... values) {
		return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROJECTID, values);
	}

	/**
	 * Fetch records that have <code>facilityId IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchByFacilityid(Integer... values) {
		return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.FACILITYID, values);
	}

	/**
	 * Fetch records that have <code>propname IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchByPropname(String... values) {
		return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROPNAME, values);
	}

	/**
	 * Fetch records that have <code>propvalue IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchByPropvalue(String... values) {
		return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROPVALUE, values);
	}

	/**
	 * Fetch records that have <code>timestamp IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ProjectProperties> fetchByTimestamp(java.sql.Timestamp... values) {
		return fetch(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.TIMESTAMP, values);
	}
}
