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
public class Usermap implements java.io.Serializable {

    private static final long serialVersionUID = -571732426;
    private java.lang.String email;
    private java.lang.String goldId;
    private java.lang.String id;
    private java.lang.String name;

    public Usermap() {
    }

    public Usermap(
            java.lang.String id,
            java.lang.String name,
            java.lang.String email,
            java.lang.String goldId
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.goldId = goldId;
    }

    public java.lang.String getEmail() {
        return this.email;
    }

    public java.lang.String getGoldId() {
        return this.goldId;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public void setGoldId(java.lang.String goldId) {
        this.goldId = goldId;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}
