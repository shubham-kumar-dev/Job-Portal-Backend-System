package com.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jobportal.model.Application;
import com.jobportal.util.DBConnection;

public class ApplicationDAO {

    public boolean applyJob(int jobId, int userId) {

        String query = "INSERT INTO applications(job_id, user_id, status) VALUES (?, ?, 'APPLIED')";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, jobId);
            ps.setInt(2, userId);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Already applied or error!");
            return false;
        }
    }

    public List<Application> getApplicationsByUser(int userId) {

        List<Application> list = new ArrayList<>();

        String query = "SELECT * FROM applications WHERE user_id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Application app = new Application();
                app.setApplicationId(rs.getInt("application_id"));
                app.setJobId(rs.getInt("job_id"));
                app.setUserId(rs.getInt("user_id"));
                app.setStatus(rs.getString("status"));

                list.add(app);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}