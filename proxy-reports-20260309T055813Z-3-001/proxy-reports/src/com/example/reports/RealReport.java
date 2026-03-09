package com.example.reports;

public class RealReport implements Report {

    private final String docId;
    private final String docTitle;
    private final String accessLevel;
    private final String docContent;

    public RealReport(String docId, String docTitle, String accessLevel) {
        this.docId = docId;
        this.docTitle = docTitle;
        this.accessLevel = accessLevel;
        this.docContent = loadFromStorage();
    }

    private String loadFromStorage() {
        System.out.println("[disk] loading report " + docId + " ...");
        try { Thread.sleep(120); } 
        catch (InterruptedException ex) { Thread.currentThread().interrupt(); }

        return "Internal report body for " + docTitle;
    }

    @Override
    public void display(User currentUser) {
        System.out.println("REPORT -> id=" + docId
                + " title=" + docTitle
                + " classification=" + accessLevel
                + " openedBy=" + currentUser.getName());
        System.out.println("CONTENT: " + docContent);
    }

    public String getClassification() {
        return accessLevel;
    }
}