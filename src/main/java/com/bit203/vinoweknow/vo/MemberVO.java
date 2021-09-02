package com.bit203.vinoweknow.vo;

import lombok.Data;

import java.util.Date;

@Data
public class MemberVO {
    private int userCode;
    private String userId;
    private String userPw;
    private String userName;
    private char userGender;
    private Date userBirth;
    private String userAddr;
    private String userTel;
    private String email;
    private Date userSuDate;
    private int age;
    private boolean isAdmin;
}
