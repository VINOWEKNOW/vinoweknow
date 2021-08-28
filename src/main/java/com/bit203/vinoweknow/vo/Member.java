package com.bit203.vinoweknow.vo;

import lombok.Data;

@Data
public class Member {
    private String userId;
    private String userPw;
    private String userName;
    private String email;
    private int age;
    private boolean isActive;
    private boolean isAdmin;
}
