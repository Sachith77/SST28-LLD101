package com.example.reports;

public class ReportViewer {

    public void open(Report reportDoc, User currentUser) {
        reportDoc.display(currentUser);
    }
}