package com.jobportal.service;

import com.jobportal.dao.UserDAO;
import com.jobportal.model.User;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public boolean register(User user) {

        // basic validation
        if (user.getEmail() == null || user.getPassword() == null) {
            System.out.println("Invalid data!");
            return false;
        }

        return userDAO.registerUser(user);
    }

    public User login(String email, String password) {

        if (email == null || password == null) {
            System.out.println("Invalid input!");
            return null;
        }

        return userDAO.loginUser(email, password);
    }
}