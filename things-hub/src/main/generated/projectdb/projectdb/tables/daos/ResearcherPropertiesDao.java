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
public class ResearcherPropertiesDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.ResearcherPropertiesRecord, projectdb.tables.pojos.ResearcherProperties, Integer> {

	/**
	 * Create a new ResearcherPropertiesDao without any panAuditConfiguration
	 */
	public ResearcherPropertiesDao() {
		super(projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES, projectdb.tables.pojos.ResearcherProperties.class);
	}

	/**
	 * Create a new ResearcherPropertiesDao with an attached panAuditConfiguration
	 */
	public ResearcherPropertiesDao(org.jooq.Configuration configuration) {
		super(projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES, projectdb.tables.pojos.ResearcherProperties.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(projectdb.tables.pojos.ResearcherProperties object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ResearcherProperties> fetchById(Integer... values) {
		return fetch(projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public projectdb.tables.pojos.ResearcherProperties fetchOneById(Integer value) {
		return fetchOne(projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES.ID, value);
	}

	/**
	 * Fetch records that have <code>researcherId IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ResearcherProperties> fetchByResearcherid(Integer... values) {
		return fetch(projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES.RESEARCHERID, values);
	}

	/**
	 * Fetch records that have <code>siteId IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ResearcherProperties> fetchBySiteid(Integer... values) {
		return fetch(projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES.SITEID, values);
	}

	/**
	 * Fetch records that have <code>propname IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ResearcherProperties> fetchByPropname(String... values) {
		return fetch(projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES.PROPNAME, values);
	}

	/**
	 * Fetch records that have <code>propvalue IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ResearcherProperties> fetchByPropvalue(String... values) {
		return fetch(projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES.PROPVALUE, values);
	}

	/**
	 * Fetch records that have <code>timestamp IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.ResearcherProperties> fetchByTimestamp(java.sql.Timestamp... values) {
		return fetch(projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES.TIMESTAMP, values);
	}
}
