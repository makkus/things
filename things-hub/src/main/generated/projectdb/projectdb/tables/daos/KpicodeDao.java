/**
 * This class is generated by jOOQ
 */
package projectdb.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * For KPI NESI-9, these are it's sub categories
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KpicodeDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.KpicodeRecord, projectdb.tables.pojos.Kpicode, Integer> {

	/**
	 * Create a new KpicodeDao without any panAuditConfiguration
	 */
	public KpicodeDao() {
		super(projectdb.tables.Kpicode.KPICODE, projectdb.tables.pojos.Kpicode.class);
	}

	/**
	 * Create a new KpicodeDao with an attached panAuditConfiguration
	 */
	public KpicodeDao(org.jooq.Configuration configuration) {
		super(projectdb.tables.Kpicode.KPICODE, projectdb.tables.pojos.Kpicode.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(projectdb.tables.pojos.Kpicode object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Kpicode> fetchById(Integer... values) {
		return fetch(projectdb.tables.Kpicode.KPICODE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public projectdb.tables.pojos.Kpicode fetchOneById(Integer value) {
		return fetchOne(projectdb.tables.Kpicode.KPICODE.ID, value);
	}

	/**
	 * Fetch records that have <code>code IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Kpicode> fetchByCode(String... values) {
		return fetch(projectdb.tables.Kpicode.KPICODE.CODE, values);
	}
}
