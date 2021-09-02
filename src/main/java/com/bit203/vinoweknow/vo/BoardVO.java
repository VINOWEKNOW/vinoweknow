package com.bit203.vinoweknow.vo;

import lombok.Data;

import java.util.Date;

@Data
public class BoardVO {
    private int boardCode;
    private String boardName;
    private String boardWriter;
    private Date boardDate;
    private int boardView;
    private boolean boardState;
}
