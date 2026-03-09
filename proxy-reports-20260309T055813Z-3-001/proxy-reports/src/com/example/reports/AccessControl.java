package com.example.reports;

public class AccessControl {

    public boolean canAccess(User currentUser, String accessLevel) {
        String userRole = currentUser.getRole();

        if ("PUBLIC".equals(accessLevel)) return true;
        if ("FACULTY".equals(accessLevel)) {
            return "FACULTY".equals(userRole) || "ADMIN".equals(userRole);
        }
        if ("ADMIN".equals(accessLevel)) {
            return "ADMIN".equals(userRole);
        }
        return false;
    }
}
