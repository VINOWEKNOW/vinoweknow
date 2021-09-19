package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.dao.WineDao;
import com.bit203.vinoweknow.vo.WineVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private WineDao wineDao;

    // index
    @RequestMapping(value={"", "/", "/main"})
    public String index(Model model) {
        System.out.println("main index 진입 #####");

        List<WineVO> recommendWineList  = wineDao.wineList();
        System.out.println(recommendWineList);

        model.addAttribute("wineList", recommendWineList);

        return "index";
    }

}
