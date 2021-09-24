package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.dao.QuestionsDAO;
import com.bit203.vinoweknow.vo.QuestionsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/ques")
public class QuestionsController {

    @Autowired
    private QuestionsDAO questionsDAO;

    @RequestMapping("/view")
    public String questionsView(Model model) {
        List<QuestionsVO> questionsVOList = questionsDAO.listQuestions();
        System.out.println(questionsVOList);
        model.addAttribute("questionsVOList", questionsVOList);

        return "questions/questionsView";
    }

    @RequestMapping("/createQues")
    public String createQuestions(Model model) {
        return "questions/createQues";
    }


    @RequestMapping("/view01")
    public String questionsView01(Model model) {
       // List<QuestionsVO> questionsVOList = questionsDAO.listQuestions();
      ///  System.out.println(questionsVOList);
       // model.addAttribute("questionsVOList", questionsVOList);

        return "questions/questionsView";
    }


}
