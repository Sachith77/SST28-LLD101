package com.example.reports;

/**
 * CURRENT STATE (BROKEN ON PURPOSE):
 * - Concrete class used directly by clients
 * - Expensive load happens every time display() is called
 * - No access control
 *
 * TODO: Convert this into the RealSubject behind a Proxy, or replace with RealReport.
 */
public class ReportFile {

    private final String docId;
    private final String docTitle;
    private final String accessLevel; // PUBLIC / FACULTY / ADMIN

    public ReportFile(String docId, String docTitle, String accessLevel) {
        this.docId = docId;
        this.docTitle = docTitle;
        this.accessLevel = accessLevel;
    }

    public void display(User currentUser) {
        String documentContent = loadFromStorage();
        System.out.println("REPORT -> id=" + docId
                + " title=" + docTitle
                + " classification=" + accessLevel
                + " openedBy=" + currentUser.getName());
        System.out.println("CONTENT: " + documentContent);
    }

    private String loadFromStorage() {
        System.out.println("[disk] loading report " + docId + " ...");
        try { Thread.sleep(120); } catch (InterruptedException ex) { Thread.currentThread().interrupt(); }
        return "Internal report body for " + docTitle;
    }
}
