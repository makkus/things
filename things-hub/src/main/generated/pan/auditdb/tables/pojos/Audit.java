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
public class Audit implements java.io.Serializable {

    private static final long serialVersionUID = -1849559458;
    private java.lang.String account;
    private java.lang.Integer appstatus;
    private java.lang.Integer cores;
    private java.lang.Integer done;
    private java.lang.String executable;
    private java.lang.Integer flags;
    private java.lang.Integer id;
    private java.lang.String iwd;
    private java.lang.String jobgroup;
    private java.lang.String jobid;
    private java.lang.String jobname;
    private java.lang.String jobtype;
    private java.lang.String machine;
    private java.lang.Long mem;
    private java.lang.Integer memrequested;
    private java.lang.Integer nodes;
    private java.lang.String processors;
    private java.lang.Integer qtime;
    private java.lang.String queue;
    private java.lang.Long recordId;
    private java.lang.Integer start;
    private java.lang.Integer status;
    private java.lang.String user;
    private java.lang.Long utilisation;
    private java.lang.Long vmem;
    private java.lang.Long walltime;

    public Audit() {
    }

    public Audit(
            java.lang.Integer id,
            java.lang.String jobid,
            java.lang.String queue,
            java.lang.String user,
            java.lang.String jobname,
            java.lang.String jobgroup,
            java.lang.String account,
            java.lang.Integer status,
            java.lang.Integer cores,
            java.lang.Integer memrequested,
            java.lang.Long walltime,
            java.lang.Integer qtime,
            java.lang.Integer start,
            java.lang.Integer done,
            java.lang.String jobtype,
            java.lang.String executable,
            java.lang.Long mem,
            java.lang.Long vmem,
            java.lang.Integer appstatus,
            java.lang.String iwd,
            java.lang.Long utilisation,
            java.lang.Integer nodes,
            java.lang.String processors,
            java.lang.Integer flags,
            java.lang.Long recordId,
            java.lang.String machine
    ) {
        this.id = id;
        this.jobid = jobid;
        this.queue = queue;
        this.user = user;
        this.jobname = jobname;
        this.jobgroup = jobgroup;
        this.account = account;
        this.status = status;
        this.cores = cores;
        this.memrequested = memrequested;
        this.walltime = walltime;
        this.qtime = qtime;
        this.start = start;
        this.done = done;
        this.jobtype = jobtype;
        this.executable = executable;
        this.mem = mem;
        this.vmem = vmem;
        this.appstatus = appstatus;
        this.iwd = iwd;
        this.utilisation = utilisation;
        this.nodes = nodes;
        this.processors = processors;
        this.flags = flags;
        this.recordId = recordId;
        this.machine = machine;
    }

    public java.lang.String getAccount() {
        return this.account;
    }

    public java.lang.Integer getAppstatus() {
        return this.appstatus;
    }

    public java.lang.Integer getCores() {
        return this.cores;
    }

    public java.lang.Integer getDone() {
        return this.done;
    }

    public java.lang.String getExecutable() {
        return this.executable;
    }

    public java.lang.Integer getFlags() {
        return this.flags;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public java.lang.String getIwd() {
        return this.iwd;
    }

    public java.lang.String getJobgroup() {
        return this.jobgroup;
    }

    public java.lang.String getJobid() {
        return this.jobid;
    }

    public java.lang.String getJobname() {
        return this.jobname;
    }

    public java.lang.String getJobtype() {
        return this.jobtype;
    }

    public java.lang.String getMachine() {
        return this.machine;
    }

    public java.lang.Long getMem() {
        return this.mem;
    }

    public java.lang.Integer getMemrequested() {
        return this.memrequested;
    }

    public java.lang.Integer getNodes() {
        return this.nodes;
    }

    public java.lang.String getProcessors() {
        return this.processors;
    }

    public java.lang.Integer getQtime() {
        return this.qtime;
    }

    public java.lang.String getQueue() {
        return this.queue;
    }

    public java.lang.Long getRecordId() {
        return this.recordId;
    }

    public java.lang.Integer getStart() {
        return this.start;
    }

    public java.lang.Integer getStatus() {
        return this.status;
    }

    public java.lang.String getUser() {
        return this.user;
    }

    public java.lang.Long getUtilisation() {
        return this.utilisation;
    }

    public java.lang.Long getVmem() {
        return this.vmem;
    }

    public java.lang.Long getWalltime() {
        return this.walltime;
    }

    public void setAccount(java.lang.String account) {
        this.account = account;
    }

    public void setAppstatus(java.lang.Integer appstatus) {
        this.appstatus = appstatus;
    }

    public void setCores(java.lang.Integer cores) {
        this.cores = cores;
    }

    public void setDone(java.lang.Integer done) {
        this.done = done;
    }

    public void setExecutable(java.lang.String executable) {
        this.executable = executable;
    }

    public void setFlags(java.lang.Integer flags) {
        this.flags = flags;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public void setIwd(java.lang.String iwd) {
        this.iwd = iwd;
    }

    public void setJobgroup(java.lang.String jobgroup) {
        this.jobgroup = jobgroup;
    }

    public void setJobid(java.lang.String jobid) {
        this.jobid = jobid;
    }

    public void setJobname(java.lang.String jobname) {
        this.jobname = jobname;
    }

    public void setJobtype(java.lang.String jobtype) {
        this.jobtype = jobtype;
    }

    public void setMachine(java.lang.String machine) {
        this.machine = machine;
    }

    public void setMem(java.lang.Long mem) {
        this.mem = mem;
    }

    public void setMemrequested(java.lang.Integer memrequested) {
        this.memrequested = memrequested;
    }

    public void setNodes(java.lang.Integer nodes) {
        this.nodes = nodes;
    }

    public void setProcessors(java.lang.String processors) {
        this.processors = processors;
    }

    public void setQtime(java.lang.Integer qtime) {
        this.qtime = qtime;
    }

    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }

    public void setRecordId(java.lang.Long recordId) {
        this.recordId = recordId;
    }

    public void setStart(java.lang.Integer start) {
        this.start = start;
    }

    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }

    public void setUser(java.lang.String user) {
        this.user = user;
    }

    public void setUtilisation(java.lang.Long utilisation) {
        this.utilisation = utilisation;
    }

    public void setVmem(java.lang.Long vmem) {
        this.vmem = vmem;
    }

    public void setWalltime(java.lang.Long walltime) {
        this.walltime = walltime;
    }
}
