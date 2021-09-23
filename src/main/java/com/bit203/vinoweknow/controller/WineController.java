package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.dao.WineDao;
import com.bit203.vinoweknow.vo.WineVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/wine")
@Controller
public class WineController {

    @Autowired
    private WineDao wineDao;

    //와인 등록
    @RequestMapping("/wine/winereg")
    String insertWine(WineDao wineDao) {
        return "";
    }

    //와인 조회
    @RequestMapping("/wineinfo")
    public String searchWine(WineVO wine) {

        return "";
    }

    //와인 목록 조회
    @RequestMapping("/winelist")
    public String listWine(WineVO wine, Model model) {
        List<WineVO> wineList = wineDao.wineList();
        System.out.println("###########################");
        System.out.println(wineList);
        model.addAttribute("WineList", wineList);
        return "index";
    }

    //와인 삭제

}
