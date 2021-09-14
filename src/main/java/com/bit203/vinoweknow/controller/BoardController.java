package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.dao.BoardDAO;
import com.bit203.vinoweknow.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardDAO boardDAO;

    @RequestMapping("/view")
    public String boardView(Model model) {
        List<BoardVO> boardVOList = boardDAO.listBoard();
        System.out.println(boardVOList);
        model.addAttribute("boardVOList", boardVOList);

//        System.out.println("board 연결");
        return "board/boardView";
    }




}
