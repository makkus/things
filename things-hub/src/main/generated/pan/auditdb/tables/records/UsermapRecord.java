/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables.records;

/**
 * This class is generated by jOOQ.
 * <p>
 * InnoDB free: 8458240 kB
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UsermapRecord extends org.jooq.impl.UpdatableRecordImpl<pan.auditdb.tables.records.UsermapRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

    private static final long serialVersionUID = 812522642;

    /**
     * Create a detached UsermapRecord
     */
    public UsermapRecord() {
        super(pan.auditdb.tables.Usermap.USERMAP);
    }

    /**
     * Create a detached, initialised UsermapRecord
     */
    public UsermapRecord(java.lang.String id, java.lang.String name, java.lang.String email, java.lang.String goldId) {
        super(pan.auditdb.tables.Usermap.USERMAP);

        setValue(0, id);
        setValue(1, name);
        setValue(2, email);
        setValue(3, goldId);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field1() {
        return pan.auditdb.tables.Usermap.USERMAP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field2() {
        return pan.auditdb.tables.Usermap.USERMAP.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field3() {
        return pan.auditdb.tables.Usermap.USERMAP.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field4() {
        return pan.auditdb.tables.Usermap.USERMAP.GOLD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row4) super.fieldsRow();
    }

    /**
     * Getter for <code>pandora_audit.usermap.email</code>.
     */
    public java.lang.String getEmail() {
        return (java.lang.String) getValue(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>pandora_audit.usermap.gold_id</code>.
     */
    public java.lang.String getGoldId() {
        return (java.lang.String) getValue(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>pandora_audit.usermap.id</code>.
     */
    public java.lang.String getId() {
        return (java.lang.String) getValue(0);
    }

    /**
     * Getter for <code>pandora_audit.usermap.name</code>.
     */
    public java.lang.String getName() {
        return (java.lang.String) getValue(1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<java.lang.String> key() {
        return (org.jooq.Record1) super.key();
    }

    /**
     * Setter for <code>pandora_audit.usermap.email</code>.
     */
    public void setEmail(java.lang.String value) {
        setValue(2, value);
    }

    /**
     * Setter for <code>pandora_audit.usermap.gold_id</code>.
     */
    public void setGoldId(java.lang.String value) {
        setValue(3, value);
    }

    /**
     * Setter for <code>pandora_audit.usermap.id</code>.
     */
    public void setId(java.lang.String value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>pandora_audit.usermap.name</code>.
     */
    public void setName(java.lang.String value) {
        setValue(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsermapRecord value1(java.lang.String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsermapRecord value2(java.lang.String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsermapRecord value3(java.lang.String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value4() {
        return getGoldId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsermapRecord value4(java.lang.String value) {
        setGoldId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public UsermapRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
        return (org.jooq.Row4) super.valuesRow();
    }
}
