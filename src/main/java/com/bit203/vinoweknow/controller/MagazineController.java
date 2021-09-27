package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.service.MagazineService;
import com.bit203.vinoweknow.vo.KnowVO;
import com.bit203.vinoweknow.vo.NewsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/magazine")
public class MagazineController {

    @Autowired
    private MagazineService magazineService;

    @RequestMapping("/listnews")
    public String listNews(Model model) {
        List<NewsVO> newsVOList = magazineService.listNews();
        model.addAttribute("newsVOList", newsVOList);
        return "magazine/listNews";

    }

//    @RequestMapping("/createnews")
//    public String createNews(@RequestParam(value="newsCode") int newsCode, Model model) {
//        String newsTitle = "제목";
//        String newsCont = "내용";
//        String newsWriter = "홍길동";
//
//        model.addAttribute("newsTitle", newsTitle);
//        model.addAttribute("newsCont", newsCont);
//        model.addAttribute("newsWriter", newsWriter);
//        return "magazine/createNews";
//    }

    @RequestMapping("/createnews")
    public String createNews() {
        return "magazine/createNews";
    }

    @RequestMapping("/insertnews")
    public String insertNews(NewsVO newsVO) {
        magazineService.createNews(newsVO);
        return "redirect:magazine/listnews";
    }

    @RequestMapping("/readnews")
    public String readNews(){
        return "magazine/readNews";
    }

    public String updateNews(){
        return "magazine/updateNews";
    }

    @RequestMapping("/listknow")
    public String listKnow(Model model) {
        List<KnowVO> knowVOList = magazineService.listKnow();
        System.out.print(knowVOList);
        model.addAttribute("knowVOList", knowVOList);
        return "magazine/listKnow";

    }



}
