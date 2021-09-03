package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.dao.SubscriptionDao;
import com.bit203.vinoweknow.vo.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class SubscriptionController {

    @Autowired
    private SubscriptionDao subscriptionDao;

    @PostMapping("")
    public Subscription postSubscription(@RequestBody Subscription subscription) {
        subscriptionDao.insert(subscription);
        return subscription;
    }

    @PostMapping("")
    public Subscription postOrder(@RequestBody Subscription subscription) {
        subscriptionDao.insert(subscription);
        return subscription;
    }





}
