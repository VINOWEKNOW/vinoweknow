package com.bit203.vinoweknow.vo;

import lombok.Data;

import java.util.Date;

@Data
public class MagazineVO {
    private int newsCode;
    private String newsTitle;
    private String newsCont;
    private String newsWriter;
    private Date newsDate;
    private char newsStatus;
    private int newsViews;
    private int knowCode;
    private String knowTitle;
    private String knowCont;
    private String knowWriter;
    private Date knowDate;
    private char knowStatus;
    private int knowViews;


}
