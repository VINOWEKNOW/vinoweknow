package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.dao.MagazineDAO;
import com.bit203.vinoweknow.vo.MagazineVO;
import com.bit203.vinoweknow.vo.NewsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/mg")
public class MagazineController {

    @Autowired
    private MagazineDAO magazineDAO;

//    List<MagazineVO>


    @RequestMapping("/view")
    public String magazineView(Model model) {
        List<NewsVO> newsVOList = magazineDAO.listNews();
        System.out.print(newsVOList);
        model.addAttribute("newsVOList", newsVOList);
        return "magazine/magazineView";

    }


}
