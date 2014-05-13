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
public class Researcher extends org.jooq.impl.TableImpl<projectdb.tables.records.ResearcherRecord> {

	private static final long serialVersionUID = 599513191;

	/**
	 * The singleton instance of <code>projectdb.researcher</code>
	 */
	public static final projectdb.tables.Researcher RESEARCHER = new projectdb.tables.Researcher();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<projectdb.tables.records.ResearcherRecord> getRecordType() {
		return projectdb.tables.records.ResearcherRecord.class;
	}

	/**
	 * The column <code>projectdb.researcher.id</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>projectdb.researcher.fullName</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> FULLNAME = createField("fullName", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>projectdb.researcher.preferredName</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> PREFERREDNAME = createField("preferredName", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>projectdb.researcher.email</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>projectdb.researcher.phone</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>projectdb.researcher.institution</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> INSTITUTION = createField("institution", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>projectdb.researcher.division</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> DIVISION = createField("division", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>projectdb.researcher.department</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> DEPARTMENT = createField("department", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>projectdb.researcher.institutionalRoleId</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, Integer> INSTITUTIONALROLEID = createField("institutionalRoleId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>projectdb.researcher.pictureUrl</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> PICTUREURL = createField("pictureUrl", org.jooq.impl.SQLDataType.VARCHAR.length(300), this, "");

	/**
	 * The column <code>projectdb.researcher.startDate</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> STARTDATE = createField("startDate", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>projectdb.researcher.endDate</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> ENDDATE = createField("endDate", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>projectdb.researcher.notes</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> NOTES = createField("notes", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>projectdb.researcher.statusId</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, Integer> STATUSID = createField("statusId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>projectdb.researcher.tuakiriToken</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, String> TUAKIRITOKEN = createField("tuakiriToken", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>projectdb.researcher.lastModified</code>. A unix timestamp indicating the last time the researcher was edited
	 */
	public final org.jooq.TableField<projectdb.tables.records.ResearcherRecord, java.sql.Timestamp> LASTMODIFIED = createField("lastModified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "A unix timestamp indicating the last time the researcher was edited");

	/**
	 * Create a <code>projectdb.researcher</code> table reference
	 */
	public Researcher() {
		this("researcher", null);
	}

	/**
	 * Create an aliased <code>projectdb.researcher</code> table reference
	 */
	public Researcher(String alias) {
		this(alias, projectdb.tables.Researcher.RESEARCHER);
	}

	private Researcher(String alias, org.jooq.Table<projectdb.tables.records.ResearcherRecord> aliased) {
		this(alias, aliased, null);
	}

	private Researcher(String alias, org.jooq.Table<projectdb.tables.records.ResearcherRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, projectdb.Projectdb.PROJECTDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<projectdb.tables.records.ResearcherRecord, Integer> getIdentity() {
		return projectdb.Keys.IDENTITY_RESEARCHER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<projectdb.tables.records.ResearcherRecord> getPrimaryKey() {
		return projectdb.Keys.KEY_RESEARCHER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<projectdb.tables.records.ResearcherRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<projectdb.tables.records.ResearcherRecord>>asList(projectdb.Keys.KEY_RESEARCHER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public projectdb.tables.Researcher as(String alias) {
		return new projectdb.tables.Researcher(alias, this);
	}

	/**
	 * Rename this table
	 */
	public projectdb.tables.Researcher rename(String name) {
		return new projectdb.tables.Researcher(name, null);
	}
}
