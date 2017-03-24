package me.dewitt.pojo;

public class JobDetailWithBLOBs extends JobDetail {
    private String information;

    private String introdution;

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information == null ? null : information.trim();
    }

    public String getIntrodution() {
        return introdution;
    }

    public void setIntrodution(String introdution) {
        this.introdution = introdution == null ? null : introdution.trim();
    }
}