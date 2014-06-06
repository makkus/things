/**
 * This class is generated by jOOQ
 */
package projectdb;

/**
 * This class is generated by jOOQ.
 * <p>
 * A class modelling foreign key relationships between tables of the <code>projectdb</code>
 * schema
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
        public static final org.jooq.ForeignKey<projectdb.tables.records.AdviseractionRecord, projectdb.tables.records.ProjectRecord> ADVISERACTION_IBFK_1 = createForeignKey(projectdb.Keys.KEY_PROJECT_PRIMARY, projectdb.tables.Adviseraction.ADVISERACTION, projectdb.tables.Adviseraction.ADVISERACTION.PROJECTID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.AdviserProjectRecord, projectdb.tables.records.AdviserRecord> ADVISER_PROJECT_IBFK_1 = createForeignKey(projectdb.Keys.KEY_ADVISER_PRIMARY, projectdb.tables.AdviserProject.ADVISER_PROJECT, projectdb.tables.AdviserProject.ADVISER_PROJECT.ADVISERID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.AdviserProjectRecord, projectdb.tables.records.ProjectRecord> ADVISER_PROJECT_IBFK_2 = createForeignKey(projectdb.Keys.KEY_PROJECT_PRIMARY, projectdb.tables.AdviserProject.ADVISER_PROJECT, projectdb.tables.AdviserProject.ADVISER_PROJECT.PROJECTID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.AttachmentRecord, projectdb.tables.records.ProjectRecord> ATTACHMENT_IBFK_1 = createForeignKey(projectdb.Keys.KEY_PROJECT_PRIMARY, projectdb.tables.Attachment.ATTACHMENT, projectdb.tables.Attachment.ATTACHMENT.PROJECTID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.AttachmentRecord, projectdb.tables.records.ProjectfollowupRecord> ATTACHMENT_IBFK_2 = createForeignKey(projectdb.Keys.KEY_PROJECTFOLLOWUP_PRIMARY, projectdb.tables.Attachment.ATTACHMENT, projectdb.tables.Attachment.ATTACHMENT.FOLLOWUPID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.AttachmentRecord, projectdb.tables.records.ProjectreviewRecord> ATTACHMENT_IBFK_3 = createForeignKey(projectdb.Keys.KEY_PROJECTREVIEW_PRIMARY, projectdb.tables.Attachment.ATTACHMENT, projectdb.tables.Attachment.ATTACHMENT.REVIEWID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.AttachmentRecord, projectdb.tables.records.AdviseractionRecord> ATTACHMENT_IBFK_4 = createForeignKey(projectdb.Keys.KEY_ADVISERACTION_PRIMARY, projectdb.tables.Attachment.ATTACHMENT, projectdb.tables.Attachment.ATTACHMENT.ADVISERACTIONID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.DepartmentRecord, projectdb.tables.records.InstitutionRecord> DEPARTMENT_IBFK1 = createForeignKey(projectdb.Keys.KEY_INSTITUTION_PRIMARY, projectdb.tables.Department.DEPARTMENT, projectdb.tables.Department.DEPARTMENT.INSTITUTIONID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.DepartmentRecord, projectdb.tables.records.DivisionRecord> DEPARTMENT_IBFK2 = createForeignKey(projectdb.Keys.KEY_DIVISION_PRIMARY, projectdb.tables.Department.DEPARTMENT, projectdb.tables.Department.DEPARTMENT.DIVISIONID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.DivisionRecord, projectdb.tables.records.InstitutionRecord> DIVISION_IBFK1 = createForeignKey(projectdb.Keys.KEY_INSTITUTION_PRIMARY, projectdb.tables.Division.DIVISION, projectdb.tables.Division.DIVISION.INSTITUTIONID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.FacilityRecord, projectdb.tables.records.SiteRecord> FACILITY_IBFK_1 = createForeignKey(projectdb.Keys.KEY_SITE_PRIMARY, projectdb.tables.Facility.FACILITY, projectdb.tables.Facility.FACILITY.SITEID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectfollowupRecord, projectdb.tables.records.ProjectRecord> PROJECTFOLLOWUP_IBFK_1 = createForeignKey(projectdb.Keys.KEY_PROJECT_PRIMARY, projectdb.tables.Projectfollowup.PROJECTFOLLOWUP, projectdb.tables.Projectfollowup.PROJECTFOLLOWUP.PROJECTID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectreviewRecord, projectdb.tables.records.ProjectRecord> PROJECTREVIEW_IBFK_1 = createForeignKey(projectdb.Keys.KEY_PROJECT_PRIMARY, projectdb.tables.Projectreview.PROJECTREVIEW, projectdb.tables.Projectreview.PROJECTREVIEW.PROJECTID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectFacilityRecord, projectdb.tables.records.ProjectRecord> PROJECT_FACILITY_IBFK_1 = createForeignKey(projectdb.Keys.KEY_PROJECT_PRIMARY, projectdb.tables.ProjectFacility.PROJECT_FACILITY, projectdb.tables.ProjectFacility.PROJECT_FACILITY.PROJECTID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectKpiRecord, projectdb.tables.records.ProjectRecord> PROJECT_KPI_IBFK_1 = createForeignKey(projectdb.Keys.KEY_PROJECT_PRIMARY, projectdb.tables.ProjectKpi.PROJECT_KPI, projectdb.tables.ProjectKpi.PROJECT_KPI.PROJECTID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectPropertiesRecord, projectdb.tables.records.ProjectRecord> PROJECT_PROPERTIES_IBFK_1 = createForeignKey(projectdb.Keys.KEY_PROJECT_PRIMARY, projectdb.tables.ProjectProperties.PROJECT_PROPERTIES, projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROJECTID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectPropertiesRecord, projectdb.tables.records.FacilityRecord> PROJECT_PROPERTIES_IBFK_3 = createForeignKey(projectdb.Keys.KEY_FACILITY_PRIMARY, projectdb.tables.ProjectProperties.PROJECT_PROPERTIES, projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.FACILITYID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.ResearcherProjectRecord, projectdb.tables.records.ResearcherRecord> RESEARCHER_PROJECT_IBFK_1 = createForeignKey(projectdb.Keys.KEY_RESEARCHER_PRIMARY, projectdb.tables.ResearcherProject.RESEARCHER_PROJECT, projectdb.tables.ResearcherProject.RESEARCHER_PROJECT.RESEARCHERID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.ResearcherProjectRecord, projectdb.tables.records.ProjectRecord> RESEARCHER_PROJECT_IBFK_2 = createForeignKey(projectdb.Keys.KEY_PROJECT_PRIMARY, projectdb.tables.ResearcherProject.RESEARCHER_PROJECT, projectdb.tables.ResearcherProject.RESEARCHER_PROJECT.PROJECTID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.ResearcherPropertiesRecord, projectdb.tables.records.ResearcherRecord> RESEARCHER_PROPERTIES_IBFK_2 = createForeignKey(projectdb.Keys.KEY_RESEARCHER_PRIMARY, projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES, projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES.RESEARCHERID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.ResearcherPropertiesRecord, projectdb.tables.records.SiteRecord> RESEARCHER_PROPERTIES_IBFK_1 = createForeignKey(projectdb.Keys.KEY_SITE_PRIMARY, projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES, projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES.SITEID);
        public static final org.jooq.ForeignKey<projectdb.tables.records.ResearchoutputRecord, projectdb.tables.records.ProjectRecord> RESEARCHOUTPUT_IBFK_1 = createForeignKey(projectdb.Keys.KEY_PROJECT_PRIMARY, projectdb.tables.Researchoutput.RESEARCHOUTPUT, projectdb.tables.Researchoutput.RESEARCHOUTPUT.PROJECTID);
    }

    private static class Identities0 extends org.jooq.impl.AbstractKeys {
        public static org.jooq.Identity<projectdb.tables.records.AdviserRecord, java.lang.Integer> IDENTITY_ADVISER = createIdentity(projectdb.tables.Adviser.ADVISER, projectdb.tables.Adviser.ADVISER.ID);
        public static org.jooq.Identity<projectdb.tables.records.AdviseractionRecord, java.lang.Integer> IDENTITY_ADVISERACTION = createIdentity(projectdb.tables.Adviseraction.ADVISERACTION, projectdb.tables.Adviseraction.ADVISERACTION.ID);
        public static org.jooq.Identity<projectdb.tables.records.AdviserPropertiesRecord, java.lang.Integer> IDENTITY_ADVISER_PROPERTIES = createIdentity(projectdb.tables.AdviserProperties.ADVISER_PROPERTIES, projectdb.tables.AdviserProperties.ADVISER_PROPERTIES.ID);
        public static org.jooq.Identity<projectdb.tables.records.AttachmentRecord, java.lang.Integer> IDENTITY_ATTACHMENT = createIdentity(projectdb.tables.Attachment.ATTACHMENT, projectdb.tables.Attachment.ATTACHMENT.ID);
        public static org.jooq.Identity<projectdb.tables.records.ChangelogRecord, java.lang.Integer> IDENTITY_CHANGELOG = createIdentity(projectdb.tables.Changelog.CHANGELOG, projectdb.tables.Changelog.CHANGELOG.ID);
        public static org.jooq.Identity<projectdb.tables.records.DepartmentRecord, java.lang.Integer> IDENTITY_DEPARTMENT = createIdentity(projectdb.tables.Department.DEPARTMENT, projectdb.tables.Department.DEPARTMENT.ID);
        public static org.jooq.Identity<projectdb.tables.records.DivisionRecord, java.lang.Integer> IDENTITY_DIVISION = createIdentity(projectdb.tables.Division.DIVISION, projectdb.tables.Division.DIVISION.ID);
        public static org.jooq.Identity<projectdb.tables.records.InstitutionRecord, java.lang.Integer> IDENTITY_INSTITUTION = createIdentity(projectdb.tables.Institution.INSTITUTION, projectdb.tables.Institution.INSTITUTION.ID);
        public static org.jooq.Identity<projectdb.tables.records.ProjectRecord, java.lang.Integer> IDENTITY_PROJECT = createIdentity(projectdb.tables.Project.PROJECT, projectdb.tables.Project.PROJECT.ID);
        public static org.jooq.Identity<projectdb.tables.records.ProjectfollowupRecord, java.lang.Integer> IDENTITY_PROJECTFOLLOWUP = createIdentity(projectdb.tables.Projectfollowup.PROJECTFOLLOWUP, projectdb.tables.Projectfollowup.PROJECTFOLLOWUP.ID);
        public static org.jooq.Identity<projectdb.tables.records.ProjectreviewRecord, java.lang.Integer> IDENTITY_PROJECTREVIEW = createIdentity(projectdb.tables.Projectreview.PROJECTREVIEW, projectdb.tables.Projectreview.PROJECTREVIEW.ID);
        public static org.jooq.Identity<projectdb.tables.records.ProjectKpiRecord, java.lang.Integer> IDENTITY_PROJECT_KPI = createIdentity(projectdb.tables.ProjectKpi.PROJECT_KPI, projectdb.tables.ProjectKpi.PROJECT_KPI.ID);
        public static org.jooq.Identity<projectdb.tables.records.ProjectPropertiesRecord, java.lang.Integer> IDENTITY_PROJECT_PROPERTIES = createIdentity(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES, projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.ID);
        public static org.jooq.Identity<projectdb.tables.records.ProjectStatusRecord, java.lang.Integer> IDENTITY_PROJECT_STATUS = createIdentity(projectdb.tables.ProjectStatus.PROJECT_STATUS, projectdb.tables.ProjectStatus.PROJECT_STATUS.ID);
        public static org.jooq.Identity<projectdb.tables.records.ResearcherRecord, java.lang.Integer> IDENTITY_RESEARCHER = createIdentity(projectdb.tables.Researcher.RESEARCHER, projectdb.tables.Researcher.RESEARCHER.ID);
        public static org.jooq.Identity<projectdb.tables.records.ResearcherPropertiesRecord, java.lang.Integer> IDENTITY_RESEARCHER_PROPERTIES = createIdentity(projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES, projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES.ID);
        public static org.jooq.Identity<projectdb.tables.records.ResearcherStatusRecord, java.lang.Integer> IDENTITY_RESEARCHER_STATUS = createIdentity(projectdb.tables.ResearcherStatus.RESEARCHER_STATUS, projectdb.tables.ResearcherStatus.RESEARCHER_STATUS.ID);
        public static org.jooq.Identity<projectdb.tables.records.ResearchoutputRecord, java.lang.Integer> IDENTITY_RESEARCHOUTPUT = createIdentity(projectdb.tables.Researchoutput.RESEARCHOUTPUT, projectdb.tables.Researchoutput.RESEARCHOUTPUT.ID);
    }

    private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
        public static final org.jooq.UniqueKey<projectdb.tables.records.AdviseractionRecord> KEY_ADVISERACTION_PRIMARY = createUniqueKey(projectdb.tables.Adviseraction.ADVISERACTION, projectdb.tables.Adviseraction.ADVISERACTION.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.AdviserRecord> KEY_ADVISER_PRIMARY = createUniqueKey(projectdb.tables.Adviser.ADVISER, projectdb.tables.Adviser.ADVISER.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.AdviserPropertiesRecord> KEY_ADVISER_PROPERTIES_PRIMARY = createUniqueKey(projectdb.tables.AdviserProperties.ADVISER_PROPERTIES, projectdb.tables.AdviserProperties.ADVISER_PROPERTIES.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.AttachmentRecord> KEY_ATTACHMENT_PRIMARY = createUniqueKey(projectdb.tables.Attachment.ATTACHMENT, projectdb.tables.Attachment.ATTACHMENT.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ChangelogRecord> KEY_CHANGELOG_PRIMARY = createUniqueKey(projectdb.tables.Changelog.CHANGELOG, projectdb.tables.Changelog.CHANGELOG.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.DepartmentRecord> KEY_DEPARTMENT_PRIMARY = createUniqueKey(projectdb.tables.Department.DEPARTMENT, projectdb.tables.Department.DEPARTMENT.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.DivisionRecord> KEY_DIVISION_PRIMARY = createUniqueKey(projectdb.tables.Division.DIVISION, projectdb.tables.Division.DIVISION.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.FacilityRecord> KEY_FACILITY_PRIMARY = createUniqueKey(projectdb.tables.Facility.FACILITY, projectdb.tables.Facility.FACILITY.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.InstitutionRecord> KEY_INSTITUTION_PRIMARY = createUniqueKey(projectdb.tables.Institution.INSTITUTION, projectdb.tables.Institution.INSTITUTION.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.KpicodeRecord> KEY_KPICODE_PRIMARY = createUniqueKey(projectdb.tables.Kpicode.KPICODE, projectdb.tables.Kpicode.KPICODE.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.KpiRecord> KEY_KPI_PRIMARY = createUniqueKey(projectdb.tables.Kpi.KPI, projectdb.tables.Kpi.KPI.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectfollowupRecord> KEY_PROJECTFOLLOWUP_PRIMARY = createUniqueKey(projectdb.tables.Projectfollowup.PROJECTFOLLOWUP, projectdb.tables.Projectfollowup.PROJECTFOLLOWUP.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectreviewRecord> KEY_PROJECTREVIEW_PRIMARY = createUniqueKey(projectdb.tables.Projectreview.PROJECTREVIEW, projectdb.tables.Projectreview.PROJECTREVIEW.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ProjecttypeRecord> KEY_PROJECTTYPE_PRIMARY = createUniqueKey(projectdb.tables.Projecttype.PROJECTTYPE, projectdb.tables.Projecttype.PROJECTTYPE.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectKpiRecord> KEY_PROJECT_KPI_PRIMARY = createUniqueKey(projectdb.tables.ProjectKpi.PROJECT_KPI, projectdb.tables.ProjectKpi.PROJECT_KPI.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectRecord> KEY_PROJECT_PRIMARY = createUniqueKey(projectdb.tables.Project.PROJECT, projectdb.tables.Project.PROJECT.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectPropertiesRecord> KEY_PROJECT_PROPERTIES_ID = createUniqueKey(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES, projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectPropertiesRecord> KEY_PROJECT_PROPERTIES_PRIMARY = createUniqueKey(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES, projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectStatusRecord> KEY_PROJECT_STATUS_PRIMARY = createUniqueKey(projectdb.tables.ProjectStatus.PROJECT_STATUS, projectdb.tables.ProjectStatus.PROJECT_STATUS.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ResearcherRecord> KEY_RESEARCHER_PRIMARY = createUniqueKey(projectdb.tables.Researcher.RESEARCHER, projectdb.tables.Researcher.RESEARCHER.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ResearcherPropertiesRecord> KEY_RESEARCHER_PROPERTIES_PRIMARY = createUniqueKey(projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES, projectdb.tables.ResearcherProperties.RESEARCHER_PROPERTIES.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ResearcherStatusRecord> KEY_RESEARCHER_STATUS_PRIMARY = createUniqueKey(projectdb.tables.ResearcherStatus.RESEARCHER_STATUS, projectdb.tables.ResearcherStatus.RESEARCHER_STATUS.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.ResearchoutputRecord> KEY_RESEARCHOUTPUT_PRIMARY = createUniqueKey(projectdb.tables.Researchoutput.RESEARCHOUTPUT, projectdb.tables.Researchoutput.RESEARCHOUTPUT.ID);
        public static final org.jooq.UniqueKey<projectdb.tables.records.SiteRecord> KEY_SITE_PRIMARY = createUniqueKey(projectdb.tables.Site.SITE, projectdb.tables.Site.SITE.ID);
    }
    public static final org.jooq.ForeignKey<projectdb.tables.records.AdviseractionRecord, projectdb.tables.records.ProjectRecord> ADVISERACTION_IBFK_1 = ForeignKeys0.ADVISERACTION_IBFK_1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.AdviserProjectRecord, projectdb.tables.records.AdviserRecord> ADVISER_PROJECT_IBFK_1 = ForeignKeys0.ADVISER_PROJECT_IBFK_1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.AdviserProjectRecord, projectdb.tables.records.ProjectRecord> ADVISER_PROJECT_IBFK_2 = ForeignKeys0.ADVISER_PROJECT_IBFK_2;
    public static final org.jooq.ForeignKey<projectdb.tables.records.AttachmentRecord, projectdb.tables.records.ProjectRecord> ATTACHMENT_IBFK_1 = ForeignKeys0.ATTACHMENT_IBFK_1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.AttachmentRecord, projectdb.tables.records.ProjectfollowupRecord> ATTACHMENT_IBFK_2 = ForeignKeys0.ATTACHMENT_IBFK_2;
    public static final org.jooq.ForeignKey<projectdb.tables.records.AttachmentRecord, projectdb.tables.records.ProjectreviewRecord> ATTACHMENT_IBFK_3 = ForeignKeys0.ATTACHMENT_IBFK_3;
    public static final org.jooq.ForeignKey<projectdb.tables.records.AttachmentRecord, projectdb.tables.records.AdviseractionRecord> ATTACHMENT_IBFK_4 = ForeignKeys0.ATTACHMENT_IBFK_4;
    public static final org.jooq.ForeignKey<projectdb.tables.records.DepartmentRecord, projectdb.tables.records.InstitutionRecord> DEPARTMENT_IBFK1 = ForeignKeys0.DEPARTMENT_IBFK1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.DepartmentRecord, projectdb.tables.records.DivisionRecord> DEPARTMENT_IBFK2 = ForeignKeys0.DEPARTMENT_IBFK2;
    public static final org.jooq.ForeignKey<projectdb.tables.records.DivisionRecord, projectdb.tables.records.InstitutionRecord> DIVISION_IBFK1 = ForeignKeys0.DIVISION_IBFK1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.FacilityRecord, projectdb.tables.records.SiteRecord> FACILITY_IBFK_1 = ForeignKeys0.FACILITY_IBFK_1;
    public static final org.jooq.Identity<projectdb.tables.records.AdviserRecord, java.lang.Integer> IDENTITY_ADVISER = Identities0.IDENTITY_ADVISER;
    public static final org.jooq.Identity<projectdb.tables.records.AdviseractionRecord, java.lang.Integer> IDENTITY_ADVISERACTION = Identities0.IDENTITY_ADVISERACTION;
    public static final org.jooq.Identity<projectdb.tables.records.AdviserPropertiesRecord, java.lang.Integer> IDENTITY_ADVISER_PROPERTIES = Identities0.IDENTITY_ADVISER_PROPERTIES;
    public static final org.jooq.Identity<projectdb.tables.records.AttachmentRecord, java.lang.Integer> IDENTITY_ATTACHMENT = Identities0.IDENTITY_ATTACHMENT;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------
    public static final org.jooq.Identity<projectdb.tables.records.ChangelogRecord, java.lang.Integer> IDENTITY_CHANGELOG = Identities0.IDENTITY_CHANGELOG;
    public static final org.jooq.Identity<projectdb.tables.records.DepartmentRecord, java.lang.Integer> IDENTITY_DEPARTMENT = Identities0.IDENTITY_DEPARTMENT;
    public static final org.jooq.Identity<projectdb.tables.records.DivisionRecord, java.lang.Integer> IDENTITY_DIVISION = Identities0.IDENTITY_DIVISION;
    public static final org.jooq.Identity<projectdb.tables.records.InstitutionRecord, java.lang.Integer> IDENTITY_INSTITUTION = Identities0.IDENTITY_INSTITUTION;
    public static final org.jooq.Identity<projectdb.tables.records.ProjectRecord, java.lang.Integer> IDENTITY_PROJECT = Identities0.IDENTITY_PROJECT;
    public static final org.jooq.Identity<projectdb.tables.records.ProjectfollowupRecord, java.lang.Integer> IDENTITY_PROJECTFOLLOWUP = Identities0.IDENTITY_PROJECTFOLLOWUP;
    public static final org.jooq.Identity<projectdb.tables.records.ProjectreviewRecord, java.lang.Integer> IDENTITY_PROJECTREVIEW = Identities0.IDENTITY_PROJECTREVIEW;
    public static final org.jooq.Identity<projectdb.tables.records.ProjectKpiRecord, java.lang.Integer> IDENTITY_PROJECT_KPI = Identities0.IDENTITY_PROJECT_KPI;
    public static final org.jooq.Identity<projectdb.tables.records.ProjectPropertiesRecord, java.lang.Integer> IDENTITY_PROJECT_PROPERTIES = Identities0.IDENTITY_PROJECT_PROPERTIES;
    public static final org.jooq.Identity<projectdb.tables.records.ProjectStatusRecord, java.lang.Integer> IDENTITY_PROJECT_STATUS = Identities0.IDENTITY_PROJECT_STATUS;
    public static final org.jooq.Identity<projectdb.tables.records.ResearcherRecord, java.lang.Integer> IDENTITY_RESEARCHER = Identities0.IDENTITY_RESEARCHER;
    public static final org.jooq.Identity<projectdb.tables.records.ResearcherPropertiesRecord, java.lang.Integer> IDENTITY_RESEARCHER_PROPERTIES = Identities0.IDENTITY_RESEARCHER_PROPERTIES;
    public static final org.jooq.Identity<projectdb.tables.records.ResearcherStatusRecord, java.lang.Integer> IDENTITY_RESEARCHER_STATUS = Identities0.IDENTITY_RESEARCHER_STATUS;
    public static final org.jooq.Identity<projectdb.tables.records.ResearchoutputRecord, java.lang.Integer> IDENTITY_RESEARCHOUTPUT = Identities0.IDENTITY_RESEARCHOUTPUT;
    public static final org.jooq.UniqueKey<projectdb.tables.records.AdviseractionRecord> KEY_ADVISERACTION_PRIMARY = UniqueKeys0.KEY_ADVISERACTION_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.AdviserRecord> KEY_ADVISER_PRIMARY = UniqueKeys0.KEY_ADVISER_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.AdviserPropertiesRecord> KEY_ADVISER_PROPERTIES_PRIMARY = UniqueKeys0.KEY_ADVISER_PROPERTIES_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.AttachmentRecord> KEY_ATTACHMENT_PRIMARY = UniqueKeys0.KEY_ATTACHMENT_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ChangelogRecord> KEY_CHANGELOG_PRIMARY = UniqueKeys0.KEY_CHANGELOG_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.DepartmentRecord> KEY_DEPARTMENT_PRIMARY = UniqueKeys0.KEY_DEPARTMENT_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.DivisionRecord> KEY_DIVISION_PRIMARY = UniqueKeys0.KEY_DIVISION_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.FacilityRecord> KEY_FACILITY_PRIMARY = UniqueKeys0.KEY_FACILITY_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.InstitutionRecord> KEY_INSTITUTION_PRIMARY = UniqueKeys0.KEY_INSTITUTION_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.KpicodeRecord> KEY_KPICODE_PRIMARY = UniqueKeys0.KEY_KPICODE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------
    public static final org.jooq.UniqueKey<projectdb.tables.records.KpiRecord> KEY_KPI_PRIMARY = UniqueKeys0.KEY_KPI_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectfollowupRecord> KEY_PROJECTFOLLOWUP_PRIMARY = UniqueKeys0.KEY_PROJECTFOLLOWUP_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectreviewRecord> KEY_PROJECTREVIEW_PRIMARY = UniqueKeys0.KEY_PROJECTREVIEW_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ProjecttypeRecord> KEY_PROJECTTYPE_PRIMARY = UniqueKeys0.KEY_PROJECTTYPE_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectKpiRecord> KEY_PROJECT_KPI_PRIMARY = UniqueKeys0.KEY_PROJECT_KPI_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectRecord> KEY_PROJECT_PRIMARY = UniqueKeys0.KEY_PROJECT_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectPropertiesRecord> KEY_PROJECT_PROPERTIES_ID = UniqueKeys0.KEY_PROJECT_PROPERTIES_ID;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectPropertiesRecord> KEY_PROJECT_PROPERTIES_PRIMARY = UniqueKeys0.KEY_PROJECT_PROPERTIES_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ProjectStatusRecord> KEY_PROJECT_STATUS_PRIMARY = UniqueKeys0.KEY_PROJECT_STATUS_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ResearcherRecord> KEY_RESEARCHER_PRIMARY = UniqueKeys0.KEY_RESEARCHER_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ResearcherPropertiesRecord> KEY_RESEARCHER_PROPERTIES_PRIMARY = UniqueKeys0.KEY_RESEARCHER_PROPERTIES_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ResearcherStatusRecord> KEY_RESEARCHER_STATUS_PRIMARY = UniqueKeys0.KEY_RESEARCHER_STATUS_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.ResearchoutputRecord> KEY_RESEARCHOUTPUT_PRIMARY = UniqueKeys0.KEY_RESEARCHOUTPUT_PRIMARY;
    public static final org.jooq.UniqueKey<projectdb.tables.records.SiteRecord> KEY_SITE_PRIMARY = UniqueKeys0.KEY_SITE_PRIMARY;
    public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectfollowupRecord, projectdb.tables.records.ProjectRecord> PROJECTFOLLOWUP_IBFK_1 = ForeignKeys0.PROJECTFOLLOWUP_IBFK_1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectreviewRecord, projectdb.tables.records.ProjectRecord> PROJECTREVIEW_IBFK_1 = ForeignKeys0.PROJECTREVIEW_IBFK_1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectFacilityRecord, projectdb.tables.records.ProjectRecord> PROJECT_FACILITY_IBFK_1 = ForeignKeys0.PROJECT_FACILITY_IBFK_1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectKpiRecord, projectdb.tables.records.ProjectRecord> PROJECT_KPI_IBFK_1 = ForeignKeys0.PROJECT_KPI_IBFK_1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectPropertiesRecord, projectdb.tables.records.ProjectRecord> PROJECT_PROPERTIES_IBFK_1 = ForeignKeys0.PROJECT_PROPERTIES_IBFK_1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.ProjectPropertiesRecord, projectdb.tables.records.FacilityRecord> PROJECT_PROPERTIES_IBFK_3 = ForeignKeys0.PROJECT_PROPERTIES_IBFK_3;
    public static final org.jooq.ForeignKey<projectdb.tables.records.ResearcherProjectRecord, projectdb.tables.records.ResearcherRecord> RESEARCHER_PROJECT_IBFK_1 = ForeignKeys0.RESEARCHER_PROJECT_IBFK_1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.ResearcherProjectRecord, projectdb.tables.records.ProjectRecord> RESEARCHER_PROJECT_IBFK_2 = ForeignKeys0.RESEARCHER_PROJECT_IBFK_2;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------
    public static final org.jooq.ForeignKey<projectdb.tables.records.ResearcherPropertiesRecord, projectdb.tables.records.SiteRecord> RESEARCHER_PROPERTIES_IBFK_1 = ForeignKeys0.RESEARCHER_PROPERTIES_IBFK_1;
    public static final org.jooq.ForeignKey<projectdb.tables.records.ResearcherPropertiesRecord, projectdb.tables.records.ResearcherRecord> RESEARCHER_PROPERTIES_IBFK_2 = ForeignKeys0.RESEARCHER_PROPERTIES_IBFK_2;
    public static final org.jooq.ForeignKey<projectdb.tables.records.ResearchoutputRecord, projectdb.tables.records.ProjectRecord> RESEARCHOUTPUT_IBFK_1 = ForeignKeys0.RESEARCHOUTPUT_IBFK_1;
}