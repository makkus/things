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
public class AuditUser extends org.jooq.impl.TableImpl<pan.auditdb.tables.records.AuditUserRecord> {

	private static final long serialVersionUID = -112472852;

	/**
	 * The singleton instance of <code>pandora_audit.audit_user</code>
	 */
	public static final pan.auditdb.tables.AuditUser AUDIT_USER = new pan.auditdb.tables.AuditUser();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<pan.auditdb.tables.records.AuditUserRecord> getRecordType() {
		return pan.auditdb.tables.records.AuditUserRecord.class;
	}

	/**
	 * The column <code>pandora_audit.audit_user.user</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.AuditUserRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>pandora_audit.audit_user.cores</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.AuditUserRecord, Integer> CORES = createField("cores", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>pandora_audit.audit_user.jobtype</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.AuditUserRecord, String> JOBTYPE = createField("jobtype", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>pandora_audit.audit_user.done</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.AuditUserRecord, Integer> DONE = createField("done", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>pandora_audit.audit_user.executable</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.AuditUserRecord, String> EXECUTABLE = createField("executable", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

	/**
	 * The column <code>pandora_audit.audit_user.core_hours</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.AuditUserRecord, java.math.BigDecimal> CORE_HOURS = createField("core_hours", org.jooq.impl.SQLDataType.DECIMAL.precision(25, 4), this, "");

	/**
	 * The column <code>pandora_audit.audit_user.waiting_time</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.AuditUserRecord, java.math.BigDecimal> WAITING_TIME = createField("waiting_time", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 4), this, "");

	/**
	 * Create a <code>pandora_audit.audit_user</code> table reference
	 */
	public AuditUser() {
		this("audit_user", null);
	}

	/**
	 * Create an aliased <code>pandora_audit.audit_user</code> table reference
	 */
	public AuditUser(String alias) {
		this(alias, pan.auditdb.tables.AuditUser.AUDIT_USER);
	}

	private AuditUser(String alias, org.jooq.Table<pan.auditdb.tables.records.AuditUserRecord> aliased) {
		this(alias, aliased, null);
	}

	private AuditUser(String alias, org.jooq.Table<pan.auditdb.tables.records.AuditUserRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, pan.auditdb.PandoraAudit.PANDORA_AUDIT, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public pan.auditdb.tables.AuditUser as(String alias) {
		return new pan.auditdb.tables.AuditUser(alias, this);
	}

	/**
	 * Rename this table
	 */
	public pan.auditdb.tables.AuditUser rename(String name) {
		return new pan.auditdb.tables.AuditUser(name, null);
	}
}