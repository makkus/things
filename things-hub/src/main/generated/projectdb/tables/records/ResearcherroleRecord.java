/**
 * This class is generated by jOOQ
 */
package projectdb.tables.records;

/**
 * This class is generated by jOOQ.
 * <p>
 * What role the researcher has on a project. Known as a RPLink
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ResearcherroleRecord extends org.jooq.impl.TableRecordImpl<projectdb.tables.records.ResearcherroleRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.String> {

    private static final long serialVersionUID = -707884829;

    /**
     * Create a detached ResearcherroleRecord
     */
    public ResearcherroleRecord() {
        super(projectdb.tables.Researcherrole.RESEARCHERROLE);
    }

    /**
     * Create a detached, initialised ResearcherroleRecord
     */
    public ResearcherroleRecord(java.lang.Integer id, java.lang.String name) {
        super(projectdb.tables.Researcherrole.RESEARCHERROLE);

        setValue(0, id);
        setValue(1, name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return projectdb.tables.Researcherrole.RESEARCHERROLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field2() {
        return projectdb.tables.Researcherrole.RESEARCHERROLE.NAME;
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
        return (org.jooq.Row2) super.fieldsRow();
    }

    /**
     * Getter for <code>projectdb.researcherrole.id</code>.
     */
    public java.lang.Integer getId() {
        return (java.lang.Integer) getValue(0);
    }

    /**
     * Getter for <code>projectdb.researcherrole.name</code>.
     */
    public java.lang.String getName() {
        return (java.lang.String) getValue(1);
    }

    /**
     * Setter for <code>projectdb.researcherrole.id</code>.
     */
    public void setId(java.lang.Integer value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>projectdb.researcherrole.name</code>.
     */
    public void setName(java.lang.String value) {
        setValue(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResearcherroleRecord value1(java.lang.Integer value) {
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
    public ResearcherroleRecord value2(java.lang.String value) {
        setName(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ResearcherroleRecord values(java.lang.Integer value1, java.lang.String value2) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
        return (org.jooq.Row2) super.valuesRow();
    }
}
