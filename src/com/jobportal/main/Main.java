package com.jobportal.main;

import java.util.Scanner;

import com.jobportal.model.Application;
import com.jobportal.model.Job;
import com.jobportal.model.User;
import com.jobportal.service.ApplicationService;
import com.jobportal.service.JobService;
import com.jobportal.service.UserService;

public class Main {
    public static void jobSeekerMenu(User user) {

        Scanner sc = new Scanner(System.in);
        JobService jobService = new JobService();
        ApplicationService appService = new ApplicationService();

        while (true) {
            System.out.println("\n--- Job Seeker Menu ---");
            System.out.println("1. View Jobs");
            System.out.println("2. Apply Job");
            System.out.println("3. View Applications");
            System.out.println("4. Back");

            int choice = sc.nextInt();

            if (choice == 1) {

                for (Job job : jobService.viewJobs()) {
                    System.out.println("\nID: " + job.getJobId());
                    System.out.println("Title: " + job.getTitle());
                    System.out.println("Location: " + job.getLocation());
                    System.out.println("Salary: " + job.getSalary());
                }

            } else if (choice == 2) {

                System.out.print("Enter Job ID to apply: ");
                int jobId = sc.nextInt();

                if (appService.apply(jobId, user.getUserId())) {
                    System.out.println("Applied Successfully!");
                } else {
                    System.out.println("Failed / Already Applied!");
                }

            } else if (choice == 3) {

                for (Application app : appService.viewApplications(user.getUserId())) {
                    System.out.println("\nApplication ID: " + app.getApplicationId());
                    System.out.println("Job ID: " + app.getJobId());
                    System.out.println("Status: " + app.getStatus());
                }

            } else {
                break;
            }
        }
    }
    public static void recruiterMenu(User user) {

        Scanner sc = new Scanner(System.in);
        JobService jobService = new JobService();

        System.out.println("\n--- Recruiter Menu ---");
        System.out.println("1. Post Job");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Description: ");
            String desc = sc.nextLine();

            System.out.print("Location: ");
            String loc = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Job job = new Job(title, desc, loc, salary, user.getUserId());

            if (jobService.postJob(job)) {
                System.out.println("Job Posted!");
            } else {
                System.out.println("Failed!");
            }
        }
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        UserService service = new UserService();

        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter email: ");
                String email = sc.nextLine();

                System.out.print("Enter password: ");
                String password = sc.nextLine();

                System.out.print("Enter role (JOB_SEEKER/RECRUITER): ");
                String role = sc.nextLine();

                User user = new User(name, email, password, role);

                if (service.register(user)) {
                    System.out.println("Registered Successfully!");
                } else {
                    System.out.println("Registration Failed!");
                }

            } else if (choice == 2) {

                System.out.print("Enter email: ");
                String email = sc.nextLine();

                System.out.print("Enter password: ");
                String password = sc.nextLine();

                User user = service.login(email, password);

                if (user != null) {
                    System.out.println("Welcome " + user.getName());

                    if (user.getRole().equalsIgnoreCase("JOB_SEEKER")) {
                        jobSeekerMenu(user);
                    } else if (user.getRole().equalsIgnoreCase("RECRUITER")) {
                        recruiterMenu(user);
                    }
                } else {
                    System.out.println("Invalid Credentials!");
                }

            } else {
                System.out.println("Exiting...");
                break;
            }
        }

        sc.close();
    }
}