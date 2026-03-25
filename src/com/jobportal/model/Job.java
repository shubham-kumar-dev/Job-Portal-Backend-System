package com.jobportal.model;

public class Job {
    private int jobId;
    private String title;
    private String description;
    private String location;
    private double salary;
    private int recruiterId;

    public Job(String title, String description, String location, double salary, int recruiterId) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.salary = salary;
        this.recruiterId = recruiterId;
    }
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getRecruiterId() {
        return recruiterId;
    }

    public void setRecruiterId(int recruiterId) {
        this.recruiterId = recruiterId;
    }

    public Job() {}

    public Job(String title, String description, String location, double salary){
        this.title = title;
        this.description = description;
        this.location = location;
        this.salary = salary;
        this.recruiterId = recruiterId;
    }
}
