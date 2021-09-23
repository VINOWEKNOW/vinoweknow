package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.dao.MagazineDAO;
import com.bit203.vinoweknow.vo.KnowVO;
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



    @RequestMapping("/newsview")
    public String newsView(Model model) {
        List<NewsVO> newsVOList = magazineDAO.listNews();
        System.out.print(newsVOList);
        model.addAttribute("newsVOList", newsVOList);
        return "magazine/newsView";

    }

    @RequestMapping("/createnews")
    public String createNews(Model model) {
        String newsTitle = "제목";
        String newsCont = "내용";
        String newsWriter = "홍길동";

        model.addAttribute("newsTitle", newsTitle);
        model.addAttribute("newsCont", newsCont);
        model.addAttribute("newsWriter", newsWriter);
        return "magazine/createNews";
    }

    @RequestMapping("/knowview")
    public String knowView(Model model) {
        List<KnowVO> knowVOList = magazineDAO.listKnow();
        System.out.print(knowVOList);
        model.addAttribute("knowVOList", knowVOList);
        return "magazine/knowView";

    }



}
