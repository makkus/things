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
public class ProjectreviewRecord extends org.jooq.impl.UpdatableRecordImpl<projectdb.tables.records.ProjectreviewRecord> implements org.jooq.Record5<Integer, Integer, Integer, String, String> {

	private static final long serialVersionUID = -1282914671;

	/**
	 * Setter for <code>projectdb.projectreview.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>projectdb.projectreview.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>projectdb.projectreview.projectId</code>.
	 */
	public void setProjectid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>projectdb.projectreview.projectId</code>.
	 */
	public Integer getProjectid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>projectdb.projectreview.adviserId</code>.
	 */
	public void setAdviserid(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>projectdb.projectreview.adviserId</code>.
	 */
	public Integer getAdviserid() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>projectdb.projectreview.date</code>.
	 */
	public void setDate(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>projectdb.projectreview.date</code>.
	 */
	public String getDate() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>projectdb.projectreview.notes</code>.
	 */
	public void setNotes(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>projectdb.projectreview.notes</code>.
	 */
	public String getNotes() {
		return (String) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<Integer, Integer, Integer, String, String> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<Integer, Integer, Integer, String, String> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field1() {
		return projectdb.tables.Projectreview.PROJECTREVIEW.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field2() {
		return projectdb.tables.Projectreview.PROJECTREVIEW.PROJECTID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field3() {
		return projectdb.tables.Projectreview.PROJECTREVIEW.ADVISERID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field4() {
		return projectdb.tables.Projectreview.PROJECTREVIEW.DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field5() {
		return projectdb.tables.Projectreview.PROJECTREVIEW.NOTES;
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
		return getAdviserid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getNotes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectreviewRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectreviewRecord value2(Integer value) {
		setProjectid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectreviewRecord value3(Integer value) {
		setAdviserid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectreviewRecord value4(String value) {
		setDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectreviewRecord value5(String value) {
		setNotes(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectreviewRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProjectreviewRecord
	 */
	public ProjectreviewRecord() {
		super(projectdb.tables.Projectreview.PROJECTREVIEW);
	}

	/**
	 * Create a detached, initialised ProjectreviewRecord
	 */
	public ProjectreviewRecord(Integer id, Integer projectid, Integer adviserid, String date, String notes) {
		super(projectdb.tables.Projectreview.PROJECTREVIEW);

		setValue(0, id);
		setValue(1, projectid);
		setValue(2, adviserid);
		setValue(3, date);
		setValue(4, notes);
	}
}
