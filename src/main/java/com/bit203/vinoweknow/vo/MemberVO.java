package com.bit203.vinoweknow.vo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MemberVO {
    private int memberCode;
    private String memberId;
    //    private String memberEmail;
    private String memberPw;
    private String memberName;
    private boolean memberGender;
    private String memberBirth;
    private String memberAddress;
    private String memberPhone;
    private String memberEmail;
    private LocalDate memberSignUp; // sysdate
    private String subscriptStatus;
    private boolean isAdmin;
}
