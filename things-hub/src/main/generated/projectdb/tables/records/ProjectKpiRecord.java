/**
 * This class is generated by jOOQ
 */
package projectdb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectKpiRecord extends org.jooq.impl.UpdatableRecordImpl<projectdb.tables.records.ProjectKpiRecord> implements org.jooq.Record8<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Double, java.lang.String, java.lang.Integer> {

    private static final long serialVersionUID = 384819680;

    /**
     * Create a detached ProjectKpiRecord
     */
    public ProjectKpiRecord() {
        super(projectdb.tables.ProjectKpi.PROJECT_KPI);
    }

    /**
     * Create a detached, initialised ProjectKpiRecord
     */
    public ProjectKpiRecord(java.lang.Integer id, java.lang.Integer kpiid, java.lang.Integer projectid, java.lang.String date, java.lang.Integer adviserid, java.lang.Double value, java.lang.String notes, java.lang.Integer code) {
        super(projectdb.tables.ProjectKpi.PROJECT_KPI);

        setValue(0, id);
        setValue(1, kpiid);
        setValue(2, projectid);
        setValue(3, date);
        setValue(4, adviserid);
        setValue(5, value);
        setValue(6, notes);
        setValue(7, code);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return projectdb.tables.ProjectKpi.PROJECT_KPI.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field2() {
        return projectdb.tables.ProjectKpi.PROJECT_KPI.KPIID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field3() {
        return projectdb.tables.ProjectKpi.PROJECT_KPI.PROJECTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field4() {
        return projectdb.tables.ProjectKpi.PROJECT_KPI.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field5() {
        return projectdb.tables.ProjectKpi.PROJECT_KPI.ADVISERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Double> field6() {
        return projectdb.tables.ProjectKpi.PROJECT_KPI.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field7() {
        return projectdb.tables.ProjectKpi.PROJECT_KPI.NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field8() {
        return projectdb.tables.ProjectKpi.PROJECT_KPI.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row8<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Double, java.lang.String, java.lang.Integer> fieldsRow() {
        return (org.jooq.Row8) super.fieldsRow();
    }

    /**
     * Getter for <code>projectdb.project_kpi.adviserId</code>.
     */
    public java.lang.Integer getAdviserid() {
        return (java.lang.Integer) getValue(4);
    }

    /**
     * Getter for <code>projectdb.project_kpi.code</code>.
     */
    public java.lang.Integer getCode() {
        return (java.lang.Integer) getValue(7);
    }

    /**
     * Getter for <code>projectdb.project_kpi.date</code>.
     */
    public java.lang.String getDate() {
        return (java.lang.String) getValue(3);
    }

    /**
     * Getter for <code>projectdb.project_kpi.id</code>.
     */
    public java.lang.Integer getId() {
        return (java.lang.Integer) getValue(0);
    }

    /**
     * Getter for <code>projectdb.project_kpi.kpiId</code>.
     */
    public java.lang.Integer getKpiid() {
        return (java.lang.Integer) getValue(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>projectdb.project_kpi.notes</code>.
     */
    public java.lang.String getNotes() {
        return (java.lang.String) getValue(6);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>projectdb.project_kpi.projectId</code>.
     */
    public java.lang.Integer getProjectid() {
        return (java.lang.Integer) getValue(2);
    }

    /**
     * Getter for <code>projectdb.project_kpi.value</code>.
     */
    public java.lang.Double getValue() {
        return (java.lang.Double) getValue(5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    /**
     * Setter for <code>projectdb.project_kpi.adviserId</code>.
     */
    public void setAdviserid(java.lang.Integer value) {
        setValue(4, value);
    }

    /**
     * Setter for <code>projectdb.project_kpi.code</code>.
     */
    public void setCode(java.lang.Integer value) {
        setValue(7, value);
    }

    /**
     * Setter for <code>projectdb.project_kpi.date</code>.
     */
    public void setDate(java.lang.String value) {
        setValue(3, value);
    }

    /**
     * Setter for <code>projectdb.project_kpi.id</code>.
     */
    public void setId(java.lang.Integer value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>projectdb.project_kpi.kpiId</code>.
     */
    public void setKpiid(java.lang.Integer value) {
        setValue(1, value);
    }

    /**
     * Setter for <code>projectdb.project_kpi.notes</code>.
     */
    public void setNotes(java.lang.String value) {
        setValue(6, value);
    }

    /**
     * Setter for <code>projectdb.project_kpi.projectId</code>.
     */
    public void setProjectid(java.lang.Integer value) {
        setValue(2, value);
    }

    /**
     * Setter for <code>projectdb.project_kpi.value</code>.
     */
    public void setValue(java.lang.Double value) {
        setValue(5, value);
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
    public ProjectKpiRecord value1(java.lang.Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value2() {
        return getKpiid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectKpiRecord value2(java.lang.Integer value) {
        setKpiid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value3() {
        return getProjectid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectKpiRecord value3(java.lang.Integer value) {
        setProjectid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value4() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectKpiRecord value4(java.lang.String value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value5() {
        return getAdviserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectKpiRecord value5(java.lang.Integer value) {
        setAdviserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Double value6() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectKpiRecord value6(java.lang.Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value7() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectKpiRecord value7(java.lang.String value) {
        setNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value8() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectKpiRecord value8(java.lang.Integer value) {
        setCode(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectKpiRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.String value4, java.lang.Integer value5, java.lang.Double value6, java.lang.String value7, java.lang.Integer value8) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row8<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Double, java.lang.String, java.lang.Integer> valuesRow() {
        return (org.jooq.Row8) super.valuesRow();
    }
}
