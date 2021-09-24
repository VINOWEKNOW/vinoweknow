package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.dao.BoardDAO;
import com.bit203.vinoweknow.vo.BoardVO;
import com.bit203.vinoweknow.vo.ContentsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardDAO boardDAO;


    //게시글 목록
    @GetMapping("/list")
    public String contentsList(Model model) {
        List<ContentsVO> contentsVOList = boardDAO.listContents();
        System.out.println(contentsVOList);
        model.addAttribute("contentsVOList", contentsVOList);

        return "board/list";
    }

    //게시글 등록 폼 호출
    @GetMapping("/form")
    //public String contForm(@RequestParam ContentsVO contCode, Model model) {
    public String contForm() {
        //model.addAttribute("contForm", boardDAO.selectCont(contCode));

        return "board/form";
    }

    @PostMapping("/form")
    public String postContents(ContentsVO contentsVO) {
        boardDAO.createCont(contentsVO);
        return "redirect:/board/list";

    }

    /*@PostMapping
    public ResponseEntity<?> postBoard(@RequestBody Board board) {
        board.setCreatedDate(LocalDateTime.now());
        board.setUpdatedDate(LocalDateTime.now());
        boardRepository.save(board);

        return new ResponseEntity<>("{}", HttpStatus.CREATED);
        }*/



    @RequestMapping("/view")
    public String boardView(Model model) {
        List<BoardVO> boardVOList = boardDAO.listBoard();
        System.out.println(boardVOList);
        model.addAttribute("boardVOList", boardVOList);

        return "board/boardView";
    }

    @RequestMapping("/cont")
    public String contentsView(Model model){
        List<ContentsVO> contentsVOList = boardDAO.listContents();
        System.out.println(contentsVOList);
        model.addAttribute("contentsVOList", contentsVOList);

        return "board/boardView";
    }

    @RequestMapping("/createCont")
    public String createContents(Model model) {

        return "board/createCont";
    }




}
