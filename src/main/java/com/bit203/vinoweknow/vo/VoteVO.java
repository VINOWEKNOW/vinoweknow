package com.bit203.vinoweknow.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class VoteVO {


    //투표
    private int voteCode;
    private String voteTitle;
    private Date voteDate;
    private int voteChoiceCode;
    private String voteChoice;
    private int voteChoiceCount;


}
