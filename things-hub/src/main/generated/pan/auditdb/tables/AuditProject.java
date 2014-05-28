/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables;

/**
 * This class is generated by jOOQ.
 * <p>
 * InnoDB free: 8458240 kB
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AuditProject extends org.jooq.impl.TableImpl<pan.auditdb.tables.records.AuditProjectRecord> {

    /**
     * The singleton instance of <code>pandora_audit.audit_project</code>
     */
    public static final pan.auditdb.tables.AuditProject AUDIT_PROJECT = new pan.auditdb.tables.AuditProject();
    private static final long serialVersionUID = 1243465127;
    /**
     * The column <code>pandora_audit.audit_project.cores</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.AuditProjectRecord, java.lang.Integer> CORES = createField("cores", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>pandora_audit.audit_project.core_hours</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.AuditProjectRecord, java.math.BigDecimal> CORE_HOURS = createField("core_hours", org.jooq.impl.SQLDataType.DECIMAL.precision(25, 4), this, "");
    /**
     * The column <code>pandora_audit.audit_project.done</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.AuditProjectRecord, java.lang.Integer> DONE = createField("done", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>pandora_audit.audit_project.grid_jobs</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.AuditProjectRecord, java.lang.Integer> GRID_JOBS = createField("grid_jobs", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");
    /**
     * The column <code>pandora_audit.audit_project.jobtype</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.AuditProjectRecord, java.lang.String> JOBTYPE = createField("jobtype", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");
    /**
     * The column <code>pandora_audit.audit_project.project</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.AuditProjectRecord, java.lang.String> PROJECT = createField("project", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");
    /**
     * The column <code>pandora_audit.audit_project.total_grid_core_hours</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.AuditProjectRecord, java.math.BigDecimal> TOTAL_GRID_CORE_HOURS = createField("total_grid_core_hours", org.jooq.impl.SQLDataType.DECIMAL.precision(25, 4), this, "");
    /**
     * The column <code>pandora_audit.audit_project.user</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.AuditProjectRecord, java.lang.String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");
    /**
     * The column <code>pandora_audit.audit_project.waiting_time</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.AuditProjectRecord, java.math.BigDecimal> WAITING_TIME = createField("waiting_time", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 4), this, "");

    /**
     * Create a <code>pandora_audit.audit_project</code> table reference
     */
    public AuditProject() {
        this("audit_project", null);
    }

    /**
     * Create an aliased <code>pandora_audit.audit_project</code> table reference
     */
    public AuditProject(java.lang.String alias) {
        this(alias, pan.auditdb.tables.AuditProject.AUDIT_PROJECT);
    }

    private AuditProject(java.lang.String alias, org.jooq.Table<pan.auditdb.tables.records.AuditProjectRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditProject(java.lang.String alias, org.jooq.Table<pan.auditdb.tables.records.AuditProjectRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, pan.auditdb.PandoraAudit.PANDORA_AUDIT, aliased, parameters, "InnoDB free: 8458240 kB");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public pan.auditdb.tables.AuditProject as(java.lang.String alias) {
        return new pan.auditdb.tables.AuditProject(alias, this);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public java.lang.Class<pan.auditdb.tables.records.AuditProjectRecord> getRecordType() {
        return pan.auditdb.tables.records.AuditProjectRecord.class;
    }

    /**
     * Rename this table
     */
    public pan.auditdb.tables.AuditProject rename(java.lang.String name) {
        return new pan.auditdb.tables.AuditProject(name, null);
    }
}
