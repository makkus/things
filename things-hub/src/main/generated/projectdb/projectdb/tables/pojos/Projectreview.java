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
public class Projectreview implements java.io.Serializable {

	private static final long serialVersionUID = 1204458663;

	private Integer id;
	private Integer projectid;
	private Integer adviserid;
	private String  date;
	private String  notes;

	public Projectreview() {}

	public Projectreview(
		Integer id,
		Integer projectid,
		Integer adviserid,
		String  date,
		String  notes
	) {
		this.id = id;
		this.projectid = projectid;
		this.adviserid = adviserid;
		this.date = date;
		this.notes = notes;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProjectid() {
		return this.projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	public Integer getAdviserid() {
		return this.adviserid;
	}

	public void setAdviserid(Integer adviserid) {
		this.adviserid = adviserid;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
