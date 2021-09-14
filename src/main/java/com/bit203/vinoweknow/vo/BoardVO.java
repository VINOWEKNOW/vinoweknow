package com.bit203.vinoweknow.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class BoardVO {
    private int boardCode;
    private String boardName;
    private String boardWriter;
    private Date boardDate;
    private int boardView;
    private boolean boardState;
}
