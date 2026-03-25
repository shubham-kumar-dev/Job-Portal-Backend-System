package com.jobportal.service;

import java.util.List;

import com.jobportal.dao.ApplicationDAO;
import com.jobportal.model.Application;

public class ApplicationService {

    private ApplicationDAO dao = new ApplicationDAO();

    public boolean apply(int jobId, int userId) {
        return dao.applyJob(jobId, userId);
    }

    public List<Application> viewApplications(int userId) {
        return dao.getApplicationsByUser(userId);
    }
}