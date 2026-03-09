package com.example.reports;

public class QuickCheck {

    public static void main(String[] args) {
        User studentUser = new User("Sachith", "STUDENT");
        User adminUser = new User("Raja", "ADMIN");

        Report adminDoc = new ReportProxy("R-303", "Budget Audit", "ADMIN");
        Report facultyDoc = new ReportProxy("R-202", "Midterm Review", "FACULTY");

        System.out.println("=== QuickCheck ===");
        facultyDoc.display(studentUser);
        System.out.println();
        adminDoc.display(adminUser);
        System.out.println();
        adminDoc.display(adminUser);
    }
}
