package com.bit203.vinoweknow.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class QuestionsVO {

    private int quesCode; // pk
    private String quesTitle;
    private String quesWriter;
    private String quesType;
    private String orderCode;  //구독권번호(주문번호)
    private String email;
    private int telephone;
    private boolean receiveCheck;
    private String quesContent;
    private Date quesDate;

}
