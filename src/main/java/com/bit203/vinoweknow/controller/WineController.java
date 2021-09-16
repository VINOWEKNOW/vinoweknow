package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.dao.WineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/wine")
@Controller
public class WineController {

//    @Autowired
    private WineDao wineDao;


}
