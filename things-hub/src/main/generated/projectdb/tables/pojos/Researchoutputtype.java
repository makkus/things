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
public class Researchoutputtype implements java.io.Serializable {

    private static final long serialVersionUID = 1426031906;

    private java.lang.Integer id;
    private java.lang.String name;

    public Researchoutputtype() {
    }

    public Researchoutputtype(
            java.lang.Integer id,
            java.lang.String name
    ) {
        this.id = id;
        this.name = name;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}
