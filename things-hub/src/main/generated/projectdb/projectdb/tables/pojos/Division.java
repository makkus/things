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
public class Division implements java.io.Serializable {

	private static final long serialVersionUID = 263503325;

	private Integer id;
	private Integer institutionid;
	private String  name;
	private String  code;

	public Division() {}

	public Division(
		Integer id,
		Integer institutionid,
		String  name,
		String  code
	) {
		this.id = id;
		this.institutionid = institutionid;
		this.name = name;
		this.code = code;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInstitutionid() {
		return this.institutionid;
	}

	public void setInstitutionid(Integer institutionid) {
		this.institutionid = institutionid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}