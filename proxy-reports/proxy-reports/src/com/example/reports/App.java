package com.example.reports;

public class App {

    public static void main(String[] args) {

        User studentUser = new User("Sachith", "STUDENT");
        User facultyMember = new User("Prof. Kumar", "FACULTY");
        User adminUser = new User("Raja", "ADMIN");

        Report publicDoc = new ReportProxy("R-101", "Orientation Plan", "PUBLIC");
        Report facultyDoc = new ReportProxy("R-202", "Midterm Review", "FACULTY");
        Report adminDoc = new ReportProxy("R-303", "Budget Audit", "ADMIN");

        ReportViewer reportViewer = new ReportViewer();

        System.out.println("=== CampusVault Demo ===");

        reportViewer.open(publicDoc, studentUser);
        System.out.println();

        reportViewer.open(facultyDoc, studentUser);
        System.out.println();

        reportViewer.open(facultyDoc, facultyMember);
        System.out.println();

        reportViewer.open(adminDoc, adminUser);
        System.out.println();

        reportViewer.open(adminDoc, adminUser);
    }
}