package com.bit203.vinoweknow.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class ContentsVO {

    private int contCode;
    private int boardCode;
    private String contTitle;
    private String contWriter;
    private String contContent;
    private String contDate;
    private Date contUpDate;
    private int contViews;

}
