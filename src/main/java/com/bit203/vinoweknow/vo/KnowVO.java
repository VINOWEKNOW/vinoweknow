package com.bit203.vinoweknow.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
public class KnowVO {


    //상식
    private int knowCode;
    private String knowTitle;
    private String knowCont;
    private String knowWriter;
    private LocalDateTime knowDate;
    private char knowStatus;
    private int knowViews;



}
