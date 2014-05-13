/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.1" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Incidents extends org.jooq.impl.TableImpl<pan.auditdb.tables.records.IncidentsRecord> {

	private static final long serialVersionUID = 251727353;

	/**
	 * The singleton instance of <code>pandora_audit.incidents</code>
	 */
	public static final pan.auditdb.tables.Incidents INCIDENTS = new pan.auditdb.tables.Incidents();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<pan.auditdb.tables.records.IncidentsRecord> getRecordType() {
		return pan.auditdb.tables.records.IncidentsRecord.class;
	}

	/**
	 * The column <code>pandora_audit.incidents.id</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pandora_audit.incidents.cluster</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, String> CLUSTER = createField("cluster", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>pandora_audit.incidents.severity</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, Integer> SEVERITY = createField("severity", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>pandora_audit.incidents.start</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, Integer> START = createField("start", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pandora_audit.incidents.done</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, Integer> DONE = createField("done", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>pandora_audit.incidents.subsystem_affected</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, String> SUBSYSTEM_AFFECTED = createField("subsystem_affected", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaulted(true), this, "");

	/**
	 * The column <code>pandora_audit.incidents.description</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(8192).defaulted(true), this, "");

	/**
	 * The column <code>pandora_audit.incidents.investigation</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, String> INVESTIGATION = createField("investigation", org.jooq.impl.SQLDataType.VARCHAR.length(8192).defaulted(true), this, "");

	/**
	 * The column <code>pandora_audit.incidents.outcome</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, String> OUTCOME = createField("outcome", org.jooq.impl.SQLDataType.VARCHAR.length(8192).defaulted(true), this, "");

	/**
	 * The column <code>pandora_audit.incidents.note</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, String> NOTE = createField("note", org.jooq.impl.SQLDataType.VARCHAR.length(8192).defaulted(true), this, "");

	/**
	 * The column <code>pandora_audit.incidents.lost_cores</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, Integer> LOST_CORES = createField("lost_cores", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>pandora_audit.incidents</code> table reference
	 */
	public Incidents() {
		this("incidents", null);
	}

	/**
	 * Create an aliased <code>pandora_audit.incidents</code> table reference
	 */
	public Incidents(String alias) {
		this(alias, pan.auditdb.tables.Incidents.INCIDENTS);
	}

	private Incidents(String alias, org.jooq.Table<pan.auditdb.tables.records.IncidentsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Incidents(String alias, org.jooq.Table<pan.auditdb.tables.records.IncidentsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, pan.auditdb.PandoraAudit.PANDORA_AUDIT, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<pan.auditdb.tables.records.IncidentsRecord, Integer> getIdentity() {
		return pan.auditdb.Keys.IDENTITY_INCIDENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<pan.auditdb.tables.records.IncidentsRecord> getPrimaryKey() {
		return pan.auditdb.Keys.KEY_INCIDENTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<pan.auditdb.tables.records.IncidentsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<pan.auditdb.tables.records.IncidentsRecord>>asList(pan.auditdb.Keys.KEY_INCIDENTS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public pan.auditdb.tables.Incidents as(String alias) {
		return new pan.auditdb.tables.Incidents(alias, this);
	}

	/**
	 * Rename this table
	 */
	public pan.auditdb.tables.Incidents rename(String name) {
		return new pan.auditdb.tables.Incidents(name, null);
	}
}
