/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 * <p>
 * InnoDB free: 8458240 kB
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Nomenclature implements java.io.Serializable {

    private static final long serialVersionUID = 1853990786;
    private java.lang.String name;
    private java.lang.String project;
    private java.lang.String study;

    public Nomenclature() {
    }

    public Nomenclature(
            java.lang.String project,
            java.lang.String name,
            java.lang.String study
    ) {
        this.project = project;
        this.name = name;
        this.study = study;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getProject() {
        return this.project;
    }

    public java.lang.String getStudy() {
        return this.study;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setProject(java.lang.String project) {
        this.project = project;
    }

    public void setStudy(java.lang.String study) {
        this.study = study;
    }
}
