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
public class Incidents extends org.jooq.impl.TableImpl<pan.auditdb.tables.records.IncidentsRecord> {

    /**
     * The singleton instance of <code>pandora_audit.incidents</code>
     */
    public static final pan.auditdb.tables.Incidents INCIDENTS = new pan.auditdb.tables.Incidents();
    private static final long serialVersionUID = 739697348;
    /**
     * The column <code>pandora_audit.incidents.cluster</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, java.lang.String> CLUSTER = createField("cluster", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaulted(true), this, "");
    /**
     * The column <code>pandora_audit.incidents.description</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(8192).defaulted(true), this, "");
    /**
     * The column <code>pandora_audit.incidents.done</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, java.lang.Integer> DONE = createField("done", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>pandora_audit.incidents.id</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>pandora_audit.incidents.investigation</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, java.lang.String> INVESTIGATION = createField("investigation", org.jooq.impl.SQLDataType.VARCHAR.length(8192).defaulted(true), this, "");
    /**
     * The column <code>pandora_audit.incidents.lost_cores</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, java.lang.Integer> LOST_CORES = createField("lost_cores", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");
    /**
     * The column <code>pandora_audit.incidents.note</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, java.lang.String> NOTE = createField("note", org.jooq.impl.SQLDataType.VARCHAR.length(8192).defaulted(true), this, "");
    /**
     * The column <code>pandora_audit.incidents.outcome</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, java.lang.String> OUTCOME = createField("outcome", org.jooq.impl.SQLDataType.VARCHAR.length(8192).defaulted(true), this, "");
    /**
     * The column <code>pandora_audit.incidents.severity</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, java.lang.Integer> SEVERITY = createField("severity", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");
    /**
     * The column <code>pandora_audit.incidents.start</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, java.lang.Integer> START = createField("start", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>pandora_audit.incidents.subsystem_affected</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.IncidentsRecord, java.lang.String> SUBSYSTEM_AFFECTED = createField("subsystem_affected", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaulted(true), this, "");

    /**
     * Create a <code>pandora_audit.incidents</code> table reference
     */
    public Incidents() {
        this("incidents", null);
    }

    /**
     * Create an aliased <code>pandora_audit.incidents</code> table reference
     */
    public Incidents(java.lang.String alias) {
        this(alias, pan.auditdb.tables.Incidents.INCIDENTS);
    }

    private Incidents(java.lang.String alias, org.jooq.Table<pan.auditdb.tables.records.IncidentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Incidents(java.lang.String alias, org.jooq.Table<pan.auditdb.tables.records.IncidentsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, pan.auditdb.PandoraAudit.PANDORA_AUDIT, aliased, parameters, "InnoDB free: 8458240 kB");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public pan.auditdb.tables.Incidents as(java.lang.String alias) {
        return new pan.auditdb.tables.Incidents(alias, this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Identity<pan.auditdb.tables.records.IncidentsRecord, java.lang.Integer> getIdentity() {
        return pan.auditdb.Keys.IDENTITY_INCIDENTS;
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
    public org.jooq.UniqueKey<pan.auditdb.tables.records.IncidentsRecord> getPrimaryKey() {
        return pan.auditdb.Keys.KEY_INCIDENTS_PRIMARY;
    }

    /**
     * The class holding records for this type
     */
    @Override
    public java.lang.Class<pan.auditdb.tables.records.IncidentsRecord> getRecordType() {
        return pan.auditdb.tables.records.IncidentsRecord.class;
    }

    /**
     * Rename this table
     */
    public pan.auditdb.tables.Incidents rename(java.lang.String name) {
        return new pan.auditdb.tables.Incidents(name, null);
    }
}
