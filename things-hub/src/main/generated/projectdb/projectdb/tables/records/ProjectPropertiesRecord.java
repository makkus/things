/**
 * This class is generated by jOOQ
 */
package projectdb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectPropertiesRecord extends org.jooq.impl.UpdatableRecordImpl<projectdb.tables.records.ProjectPropertiesRecord> implements org.jooq.Record6<Integer, Integer, Integer, String, String, java.sql.Timestamp> {

	private static final long serialVersionUID = -128141388;

	/**
	 * Setter for <code>projectdb.project_properties.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>projectdb.project_properties.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>projectdb.project_properties.projectId</code>.
	 */
	public void setProjectid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>projectdb.project_properties.projectId</code>.
	 */
	public Integer getProjectid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>projectdb.project_properties.facilityId</code>.
	 */
	public void setFacilityid(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>projectdb.project_properties.facilityId</code>.
	 */
	public Integer getFacilityid() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>projectdb.project_properties.propname</code>.
	 */
	public void setPropname(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>projectdb.project_properties.propname</code>.
	 */
	public String getPropname() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>projectdb.project_properties.propvalue</code>.
	 */
	public void setPropvalue(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>projectdb.project_properties.propvalue</code>.
	 */
	public String getPropvalue() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>projectdb.project_properties.timestamp</code>.
	 */
	public void setTimestamp(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>projectdb.project_properties.timestamp</code>.
	 */
	public java.sql.Timestamp getTimestamp() {
		return (java.sql.Timestamp) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<Integer, Integer, Integer, String, String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<Integer, Integer, Integer, String, String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field1() {
		return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field2() {
		return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROJECTID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field3() {
		return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.FACILITYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field4() {
		return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROPNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field5() {
		return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROPVALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getProjectid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getFacilityid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getPropname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getPropvalue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectPropertiesRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectPropertiesRecord value2(Integer value) {
		setProjectid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectPropertiesRecord value3(Integer value) {
		setFacilityid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectPropertiesRecord value4(String value) {
		setPropname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectPropertiesRecord value5(String value) {
		setPropvalue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectPropertiesRecord value6(java.sql.Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectPropertiesRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, java.sql.Timestamp value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProjectPropertiesRecord
	 */
	public ProjectPropertiesRecord() {
		super(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES);
	}

	/**
	 * Create a detached, initialised ProjectPropertiesRecord
	 */
	public ProjectPropertiesRecord(Integer id, Integer projectid, Integer facilityid, String propname, String propvalue, java.sql.Timestamp timestamp) {
		super(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES);

		setValue(0, id);
		setValue(1, projectid);
		setValue(2, facilityid);
		setValue(3, propname);
		setValue(4, propvalue);
		setValue(5, timestamp);
	}
}
