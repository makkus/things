/**
 * This class is generated by jOOQ
 */
package nesi.jobs.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FactDailyUsageRecord extends org.jooq.impl.UpdatableRecordImpl<nesi.jobs.tables.records.FactDailyUsageRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Date, java.lang.Double> {

	private static final long serialVersionUID = 1060757173;

	/**
	 * Setter for <code>public.fact_daily_usage.fact_daily_usage_id</code>.
	 */
	public void setFactDailyUsageId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.fact_daily_usage.fact_daily_usage_id</code>.
	 */
	public java.lang.Integer getFactDailyUsageId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.fact_daily_usage.dim_machine_id</code>.
	 */
	public void setDimMachineId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.fact_daily_usage.dim_machine_id</code>.
	 */
	public java.lang.Integer getDimMachineId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.fact_daily_usage.dim_project_id</code>.
	 */
	public void setDimProjectId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.fact_daily_usage.dim_project_id</code>.
	 */
	public java.lang.Integer getDimProjectId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.fact_daily_usage.dim_user_id</code>.
	 */
	public void setDimUserId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.fact_daily_usage.dim_user_id</code>.
	 */
	public java.lang.Integer getDimUserId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.fact_daily_usage.report_day</code>.
	 */
	public void setReportDay(java.sql.Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.fact_daily_usage.report_day</code>.
	 */
	public java.sql.Date getReportDay() {
		return (java.sql.Date) getValue(4);
	}

	/**
	 * Setter for <code>public.fact_daily_usage.period_charge</code>.
	 */
	public void setPeriodCharge(java.lang.Double value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.fact_daily_usage.period_charge</code>.
	 */
	public java.lang.Double getPeriodCharge() {
		return (java.lang.Double) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Date, java.lang.Double> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Date, java.lang.Double> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.FACT_DAILY_USAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.DIM_MACHINE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.DIM_PROJECT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.DIM_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field5() {
		return nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.REPORT_DAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field6() {
		return nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.PERIOD_CHARGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getFactDailyUsageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getDimMachineId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getDimProjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDimUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value5() {
		return getReportDay();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value6() {
		return getPeriodCharge();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactDailyUsageRecord value1(java.lang.Integer value) {
		setFactDailyUsageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactDailyUsageRecord value2(java.lang.Integer value) {
		setDimMachineId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactDailyUsageRecord value3(java.lang.Integer value) {
		setDimProjectId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactDailyUsageRecord value4(java.lang.Integer value) {
		setDimUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactDailyUsageRecord value5(java.sql.Date value) {
		setReportDay(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactDailyUsageRecord value6(java.lang.Double value) {
		setPeriodCharge(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactDailyUsageRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4, java.sql.Date value5, java.lang.Double value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FactDailyUsageRecord
	 */
	public FactDailyUsageRecord() {
		super(nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE);
	}

	/**
	 * Create a detached, initialised FactDailyUsageRecord
	 */
	public FactDailyUsageRecord(java.lang.Integer factDailyUsageId, java.lang.Integer dimMachineId, java.lang.Integer dimProjectId, java.lang.Integer dimUserId, java.sql.Date reportDay, java.lang.Double periodCharge) {
		super(nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE);

		setValue(0, factDailyUsageId);
		setValue(1, dimMachineId);
		setValue(2, dimProjectId);
		setValue(3, dimUserId);
		setValue(4, reportDay);
		setValue(5, periodCharge);
	}
}
