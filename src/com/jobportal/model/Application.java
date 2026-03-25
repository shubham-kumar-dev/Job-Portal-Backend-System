package com.jobportal.model;

public class Application {
    private int applicationId;
    private int jobId;
    private int userid;
    private String status;

    public Application(){}

    public Application(int jobId, int userId, String status){
        this.jobId = jobId;
        this.userid = userId;
        this.status = status;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserId(int userid) {
        this.userid = userid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
