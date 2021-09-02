package com.bit203.vinoweknow.vo;

import lombok.Data;

<<<<<<< HEAD
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
=======
import java.time.LocalDate;

@Data
public class MemberVO {
    private int memberCode;
    private String memberId;
    private String memberPw;
    private String memberName;
    private boolean memberGender;
    private String memberBirth;
    private String memberAddress;
    private int memberPhone;
    private String memberEmail;
    private LocalDate memberSignUp;
    private int subscriptStatus;
>>>>>>> c8330ac82826b876661089507f85628b3d159938
    private boolean isAdmin;
}
