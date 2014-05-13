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
public class TempprojectRecord extends org.jooq.impl.TableRecordImpl<projectdb.tables.records.TempprojectRecord> implements org.jooq.Record4<Integer, String, Integer, String> {

	private static final long serialVersionUID = -430509176;

	/**
	 * Setter for <code>projectdb.tempproject.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>projectdb.tempproject.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>projectdb.tempproject.owner</code>.
	 */
	public void setOwner(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>projectdb.tempproject.owner</code>.
	 */
	public String getOwner() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>projectdb.tempproject.lastVisited</code>.
	 */
	public void setLastvisited(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>projectdb.tempproject.lastVisited</code>.
	 */
	public Integer getLastvisited() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>projectdb.tempproject.projectString</code>.
	 */
	public void setProjectstring(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>projectdb.tempproject.projectString</code>.
	 */
	public String getProjectstring() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<Integer, String, Integer, String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<Integer, String, Integer, String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field1() {
		return projectdb.tables.Tempproject.TEMPPROJECT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field2() {
		return projectdb.tables.Tempproject.TEMPPROJECT.OWNER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field3() {
		return projectdb.tables.Tempproject.TEMPPROJECT.LASTVISITED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field4() {
		return projectdb.tables.Tempproject.TEMPPROJECT.PROJECTSTRING;
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
	public String value2() {
		return getOwner();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getLastvisited();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getProjectstring();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TempprojectRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TempprojectRecord value2(String value) {
		setOwner(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TempprojectRecord value3(Integer value) {
		setLastvisited(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TempprojectRecord value4(String value) {
		setProjectstring(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TempprojectRecord values(Integer value1, String value2, Integer value3, String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TempprojectRecord
	 */
	public TempprojectRecord() {
		super(projectdb.tables.Tempproject.TEMPPROJECT);
	}

	/**
	 * Create a detached, initialised TempprojectRecord
	 */
	public TempprojectRecord(Integer id, String owner, Integer lastvisited, String projectstring) {
		super(projectdb.tables.Tempproject.TEMPPROJECT);

		setValue(0, id);
		setValue(1, owner);
		setValue(2, lastvisited);
		setValue(3, projectstring);
	}
}