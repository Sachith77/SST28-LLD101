package com.example.reports;

public class User {
    private final String userName;
    private final String userRole; // STUDENT, FACULTY, ADMIN

    public User(String userName, String userRole) {
        this.userName = userName;
        this.userRole = userRole;
    }

    public String getName() { return userName; }

    public String getRole() { return userRole; }
}
