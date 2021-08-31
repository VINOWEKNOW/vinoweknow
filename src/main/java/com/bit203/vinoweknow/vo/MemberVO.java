package com.bit203.vinoweknow.vo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MemberVO {
    private int memberCode;
    private String memberId;
    private String memberPw;
    private String memberName;
    private LocalDate memberBirth;
    private String email;
    private int age;
    private boolean isAdmin;
}
