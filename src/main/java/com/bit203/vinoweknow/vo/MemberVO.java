package com.bit203.vinoweknow.vo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MemberVO {
    private int memberCode; // auto increment -> 세팅 못하겠으면 총 카운트세서 +1로 넣는 방법도 있음(중복체크)
    private String memberId;
    private String memberPw;
    private String memberName;
    private boolean memberGender;
    private String memberBirth;
    private String memberAddress;
    private int memberPhone;
    private String memberEmail;
    private LocalDate memberSignUp; // sysdate
    private String subscriptStatus;
    private boolean isAdmin;
}
