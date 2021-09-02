package com.bit203.vinoweknow.util;

public enum MemberRole {
    ADMIN("ADMIN_ROLE"),
    MEMBER("MEMBER_ROLE");

    private String value;

    private MemberRole(String role) {
        value = role;
    }

    private String getValue() {
        return value;
    }
}
