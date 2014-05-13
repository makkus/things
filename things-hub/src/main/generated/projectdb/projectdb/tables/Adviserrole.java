/**
 * This class is generated by jOOQ
 */
package projectdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Adviserrole extends org.jooq.impl.TableImpl<projectdb.tables.records.AdviserroleRecord> {

	private static final long serialVersionUID = -794578017;

	/**
	 * The singleton instance of <code>projectdb.adviserrole</code>
	 */
	public static final projectdb.tables.Adviserrole ADVISERROLE = new projectdb.tables.Adviserrole();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<projectdb.tables.records.AdviserroleRecord> getRecordType() {
		return projectdb.tables.records.AdviserroleRecord.class;
	}

	/**
	 * The column <code>projectdb.adviserrole.id</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.AdviserroleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>projectdb.adviserrole.name</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.AdviserroleRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>projectdb.adviserrole</code> table reference
	 */
	public Adviserrole() {
		this("adviserrole", null);
	}

	/**
	 * Create an aliased <code>projectdb.adviserrole</code> table reference
	 */
	public Adviserrole(String alias) {
		this(alias, projectdb.tables.Adviserrole.ADVISERROLE);
	}

	private Adviserrole(String alias, org.jooq.Table<projectdb.tables.records.AdviserroleRecord> aliased) {
		this(alias, aliased, null);
	}

	private Adviserrole(String alias, org.jooq.Table<projectdb.tables.records.AdviserroleRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, projectdb.Projectdb.PROJECTDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public projectdb.tables.Adviserrole as(String alias) {
		return new projectdb.tables.Adviserrole(alias, this);
	}

	/**
	 * Rename this table
	 */
	public projectdb.tables.Adviserrole rename(String name) {
		return new projectdb.tables.Adviserrole(name, null);
	}
}
