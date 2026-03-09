package com.example.reports;

public class ReportProxy implements Report {

    private final String docId;
    private final String docTitle;
    private final String accessLevel;

    private final AccessControl permissionChecker = new AccessControl();
    private RealReport cachedReport;   // cached real subject

    public ReportProxy(String docId, String docTitle, String accessLevel) {
        this.docId = docId;
        this.docTitle = docTitle;
        this.accessLevel = accessLevel;
    }

    @Override
    public void display(User currentUser) {

        if (!permissionChecker.canAccess(currentUser, accessLevel)) {
            System.out.println("ACCESS DENIED -> user=" + currentUser.getName()
                    + " report=" + docId);
            return;
        }

        // lazy load
        if (cachedReport == null) {
            cachedReport = new RealReport(docId, docTitle, accessLevel);
        }

        cachedReport.display(currentUser);
    }
}