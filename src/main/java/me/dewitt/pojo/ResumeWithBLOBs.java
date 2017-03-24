package me.dewitt.pojo;

public class ResumeWithBLOBs extends Resume {
    private String workExperience;

    private String projectExperience;

    private String educationExperience;

    private String graduteInfo;

    private String skillsSpeciality;

    private String additionalInfo;

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience == null ? null : workExperience.trim();
    }

    public String getProjectExperience() {
        return projectExperience;
    }

    public void setProjectExperience(String projectExperience) {
        this.projectExperience = projectExperience == null ? null : projectExperience.trim();
    }

    public String getEducationExperience() {
        return educationExperience;
    }

    public void setEducationExperience(String educationExperience) {
        this.educationExperience = educationExperience == null ? null : educationExperience.trim();
    }

    public String getGraduteInfo() {
        return graduteInfo;
    }

    public void setGraduteInfo(String graduteInfo) {
        this.graduteInfo = graduteInfo == null ? null : graduteInfo.trim();
    }

    public String getSkillsSpeciality() {
        return skillsSpeciality;
    }

    public void setSkillsSpeciality(String skillsSpeciality) {
        this.skillsSpeciality = skillsSpeciality == null ? null : skillsSpeciality.trim();
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo == null ? null : additionalInfo.trim();
    }
}