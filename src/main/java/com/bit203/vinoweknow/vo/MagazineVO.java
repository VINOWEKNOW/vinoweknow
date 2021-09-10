package com.bit203.vinoweknow.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class MagazineVO {

    //뉴스
    private int newsCode;
    private String newsTitle;
    private String newsCont;
    private String newsWriter;
    private Date newsDate;
    private char newsStatus;
    private int newsViews;

    //상식
    private int knowCode;
    private String knowTitle;
    private String knowCont;
    private String knowWriter;
    private Date knowDate;
    private char knowStatus;
    private int knowViews;

    //투표
    private int voteCode;
    private String voteTitle;
    private Date voteDate;
    private int voteChoiceCode;
    private String voteChoice;
    private int voteChoiceCount;


}
