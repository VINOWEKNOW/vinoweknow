package com.bit203.vinoweknow.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {
    private String subCode;
    private String memCode;
    private String subAddr;
    private String subType;
    private String subPayPlan;
    private int subQuantity;
    private String subStartDate;
    private String subEndDate;
    private String subProductCode;
    private List<Subscription> subscriptionList;
}
