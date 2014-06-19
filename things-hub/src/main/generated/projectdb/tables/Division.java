/**
 * This class is generated by jOOQ
 */
package projectdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Division extends org.jooq.impl.TableImpl<projectdb.tables.records.DivisionRecord> {

	private static final long serialVersionUID = -759769839;

	/**
	 * The singleton instance of <code>projectdb.division</code>
	 */
	public static final projectdb.tables.Division DIVISION = new projectdb.tables.Division();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<projectdb.tables.records.DivisionRecord> getRecordType() {
		return projectdb.tables.records.DivisionRecord.class;
	}

	/**
	 * The column <code>projectdb.division.id</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.DivisionRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>projectdb.division.institutionId</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.DivisionRecord, java.lang.Integer> INSTITUTIONID = createField("institutionId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>projectdb.division.name</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.DivisionRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>projectdb.division.code</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.DivisionRecord, java.lang.String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * Create a <code>projectdb.division</code> table reference
	 */
	public Division() {
		this("division", null);
	}

	/**
	 * Create an aliased <code>projectdb.division</code> table reference
	 */
	public Division(java.lang.String alias) {
		this(alias, projectdb.tables.Division.DIVISION);
	}

	private Division(java.lang.String alias, org.jooq.Table<projectdb.tables.records.DivisionRecord> aliased) {
		this(alias, aliased, null);
	}

	private Division(java.lang.String alias, org.jooq.Table<projectdb.tables.records.DivisionRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, projectdb.Projectdb.PROJECTDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<projectdb.tables.records.DivisionRecord, java.lang.Integer> getIdentity() {
		return projectdb.Keys.IDENTITY_DIVISION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<projectdb.tables.records.DivisionRecord> getPrimaryKey() {
		return projectdb.Keys.KEY_DIVISION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<projectdb.tables.records.DivisionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<projectdb.tables.records.DivisionRecord>>asList(projectdb.Keys.KEY_DIVISION_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<projectdb.tables.records.DivisionRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<projectdb.tables.records.DivisionRecord, ?>>asList(projectdb.Keys.DIVISION_IBFK1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public projectdb.tables.Division as(java.lang.String alias) {
		return new projectdb.tables.Division(alias, this);
	}

	/**
	 * Rename this table
	 */
	public projectdb.tables.Division rename(java.lang.String name) {
		return new projectdb.tables.Division(name, null);
	}
}
