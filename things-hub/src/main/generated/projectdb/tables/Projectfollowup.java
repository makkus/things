/**
 * This class is generated by jOOQ
 */
package projectdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Projectfollowup extends org.jooq.impl.TableImpl<projectdb.tables.records.ProjectfollowupRecord> {

    /**
     * The singleton instance of <code>projectdb.projectfollowup</code>
     */
    public static final projectdb.tables.Projectfollowup PROJECTFOLLOWUP = new projectdb.tables.Projectfollowup();
    private static final long serialVersionUID = 1518151307;
    /**
     * The column <code>projectdb.projectfollowup.adviserId</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.ProjectfollowupRecord, java.lang.Integer> ADVISERID = createField("adviserId", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>projectdb.projectfollowup.date</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.ProjectfollowupRecord, java.lang.String> DATE = createField("date", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");
    /**
     * The column <code>projectdb.projectfollowup.id</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.ProjectfollowupRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>projectdb.projectfollowup.notes</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.ProjectfollowupRecord, java.lang.String> NOTES = createField("notes", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");
    /**
     * The column <code>projectdb.projectfollowup.projectId</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.ProjectfollowupRecord, java.lang.Integer> PROJECTID = createField("projectId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>projectdb.projectfollowup.researcherId</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.ProjectfollowupRecord, java.lang.Integer> RESEARCHERID = createField("researcherId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>projectdb.projectfollowup</code> table reference
     */
    public Projectfollowup() {
        this("projectfollowup", null);
    }

    /**
     * Create an aliased <code>projectdb.projectfollowup</code> table reference
     */
    public Projectfollowup(java.lang.String alias) {
        this(alias, projectdb.tables.Projectfollowup.PROJECTFOLLOWUP);
    }

    private Projectfollowup(java.lang.String alias, org.jooq.Table<projectdb.tables.records.ProjectfollowupRecord> aliased) {
        this(alias, aliased, null);
    }

    private Projectfollowup(java.lang.String alias, org.jooq.Table<projectdb.tables.records.ProjectfollowupRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, projectdb.Projectdb.PROJECTDB, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public projectdb.tables.Projectfollowup as(java.lang.String alias) {
        return new projectdb.tables.Projectfollowup(alias, this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Identity<projectdb.tables.records.ProjectfollowupRecord, java.lang.Integer> getIdentity() {
        return projectdb.Keys.IDENTITY_PROJECTFOLLOWUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.UniqueKey<projectdb.tables.records.ProjectfollowupRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<projectdb.tables.records.ProjectfollowupRecord>>asList(projectdb.Keys.KEY_PROJECTFOLLOWUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.UniqueKey<projectdb.tables.records.ProjectfollowupRecord> getPrimaryKey() {
        return projectdb.Keys.KEY_PROJECTFOLLOWUP_PRIMARY;
    }

    /**
     * The class holding records for this type
     */
    @Override
    public java.lang.Class<projectdb.tables.records.ProjectfollowupRecord> getRecordType() {
        return projectdb.tables.records.ProjectfollowupRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.ForeignKey<projectdb.tables.records.ProjectfollowupRecord, ?>> getReferences() {
        return java.util.Arrays.<org.jooq.ForeignKey<projectdb.tables.records.ProjectfollowupRecord, ?>>asList(projectdb.Keys.PROJECTFOLLOWUP_IBFK_1);
    }

    /**
     * Rename this table
     */
    public projectdb.tables.Projectfollowup rename(java.lang.String name) {
        return new projectdb.tables.Projectfollowup(name, null);
    }
}
