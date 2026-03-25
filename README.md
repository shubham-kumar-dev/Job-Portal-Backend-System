# 💼 Job Portal Backend System (Java + JDBC)

## 📌 Overview

A role-based Job Portal backend system developed using **Core Java, JDBC, and MySQL**.
This application simulates a real-world hiring platform where recruiters can post jobs and job seekers can explore opportunities and apply.

---

## 🚀 Key Features

### 🔐 Authentication

* User Registration
* Secure Login System
* Role-based access (Job Seeker / Recruiter)

### 👥 Job Seeker Functionalities

* View available jobs
* Apply to jobs
* Track application status

### 🏢 Recruiter Functionalities

* Post new jobs
* Manage job listings

### 📊 Application Management

* Prevent duplicate applications
* Track applied jobs with status

---

## 🏗️ Tech Stack

| Layer        | Technology        |
| ------------ | ----------------- |
| Language     | Java (Core + OOP) |
| Database     | MySQL             |
| Connectivity | JDBC              |

---

## 🧱 Architecture

The project follows a **layered architecture**:

* **Model Layer** → Data objects (User, Job, Application)
* **DAO Layer** → Database interaction using JDBC
* **Service Layer** → Business logic
* **Main (CLI)** → User interaction via console

---

## 📂 Project Structure

com.jobportal
├── model
├── dao
├── service
├── util
└── main

---

## ▶️ How to Run

1. Clone the repository
2. Create MySQL database:

   ```sql
   CREATE DATABASE job_portal;
   ```
3. Update database credentials in `DBConnection.java`
4. Run `Main.java`

---

## 🧪 Sample Workflow

* Register as a **Recruiter**
* Post job openings
* Register/Login as a **Job Seeker**
* View jobs and apply
* Track application status

---

## 🎯 Key Concepts Demonstrated

* JDBC (Connection, PreparedStatement, ResultSet)
* Layered Architecture (DAO, Service)
* Role-Based Access Control
* Database Relationships (Foreign Keys)
* Input Validation & Exception Handling

---

## 🔮 Future Enhancements

* Convert to Spring Boot (REST APIs)
* Add JWT Authentication
* Implement pagination & search filters
* Build frontend UI (React/HTML)

---

## 📌 Author

**Shubham Kumar**

---

## ⭐ Note

This project focuses on **core backend fundamentals** and demonstrates how real-world systems are structured before using frameworks.
