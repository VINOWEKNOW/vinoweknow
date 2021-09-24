package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.BoardVO;
import com.bit203.vinoweknow.vo.ContentsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDAO {

    List<BoardVO> listBoard();

    void insertBoard(BoardVO boardVO);

    void delBoard(BoardVO boardVO);

    void createBoard(BoardVO boardVO);


    List<ContentsVO> listContents();

    void createCont(ContentsVO contentsVO);

    ContentsVO selectCont(ContentsVO contentsVO);












}
