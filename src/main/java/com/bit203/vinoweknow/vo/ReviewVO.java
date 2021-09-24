package com.bit203.vinoweknow.vo;

import lombok.Data;

import java.util.Date;

@Data

public class ReviewVO {

    private int reviewCode;
    private String memId;
    private int wineCode;
    private String wineName;
    private int rating;
    private String review;
    private Date reviewDate;

}
