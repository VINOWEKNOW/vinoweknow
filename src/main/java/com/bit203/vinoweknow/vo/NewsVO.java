package com.bit203.vinoweknow.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
public class NewsVO {

    //뉴스
    private int newsCode;
    private String newsTitle;
    private String newsCont;
    private String newsWriter;
    private LocalDateTime newsDate;
    private char newsStatus;
    private int newsViews;



}
