/**
 * This class is generated by jOOQ
 */
package projectdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Facility implements java.io.Serializable {

    private static final long serialVersionUID = -228388997;

    private java.lang.Integer id;
    private java.lang.String name;
    private java.lang.Integer siteid;

    public Facility() {
    }

    public Facility(
            java.lang.Integer id,
            java.lang.String name,
            java.lang.Integer siteid
    ) {
        this.id = id;
        this.name = name;
        this.siteid = siteid;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.Integer getSiteid() {
        return this.siteid;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setSiteid(java.lang.Integer siteid) {
        this.siteid = siteid;
    }
}
