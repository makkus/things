/**
 * This class is generated by jOOQ
 */
package projectdb.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SiteDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.SiteRecord, projectdb.tables.pojos.Site, java.lang.Integer> {

	/**
	 * Create a new SiteDao without any configuration
	 */
	public SiteDao() {
		super(projectdb.tables.Site.SITE, projectdb.tables.pojos.Site.class);
	}

	/**
	 * Create a new SiteDao with an attached configuration
	 */
	public SiteDao(org.jooq.Configuration configuration) {
		super(projectdb.tables.Site.SITE, projectdb.tables.pojos.Site.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(projectdb.tables.pojos.Site object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Site> fetchById(java.lang.Integer... values) {
		return fetch(projectdb.tables.Site.SITE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public projectdb.tables.pojos.Site fetchOneById(java.lang.Integer value) {
		return fetchOne(projectdb.tables.Site.SITE.ID, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Site> fetchByName(java.lang.String... values) {
		return fetch(projectdb.tables.Site.SITE.NAME, values);
	}
}