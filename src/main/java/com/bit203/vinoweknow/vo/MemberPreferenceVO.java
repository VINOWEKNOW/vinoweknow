package com.bit203.vinoweknow.vo;

import lombok.Data;

@Data
public class MemberPreferenceVO {
    private String memberCode;
    private String wineType;
    private String sweetness;
    private String acidity;
    private String body;
    private String tannin;
}