/**
 * This class is generated by jOOQ
 */
package projectdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectKpi implements java.io.Serializable {

	private static final long serialVersionUID = 2041203551;

	private Integer id;
	private Integer kpiid;
	private Integer projectid;
	private String  date;
	private Integer adviserid;
	private Double  value;
	private String  notes;
	private Integer code;

	public ProjectKpi() {}

	public ProjectKpi(
		Integer id,
		Integer kpiid,
		Integer projectid,
		String  date,
		Integer adviserid,
		Double  value,
		String  notes,
		Integer code
	) {
		this.id = id;
		this.kpiid = kpiid;
		this.projectid = projectid;
		this.date = date;
		this.adviserid = adviserid;
		this.value = value;
		this.notes = notes;
		this.code = code;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getKpiid() {
		return this.kpiid;
	}

	public void setKpiid(Integer kpiid) {
		this.kpiid = kpiid;
	}

	public Integer getProjectid() {
		return this.projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getAdviserid() {
		return this.adviserid;
	}

	public void setAdviserid(Integer adviserid) {
		this.adviserid = adviserid;
	}

	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
