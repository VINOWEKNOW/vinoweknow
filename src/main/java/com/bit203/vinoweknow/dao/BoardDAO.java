package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDAO {

    List<BoardVO> listBoard();

//    @Select("select boardCode, boardName, boardWriter, boardDate, boardView, boardState from board")

//    public List<BoardVO> selectBoardList();

    void insertBoard(BoardVO boardVO);

//    void selectBoard(BoardVO board);

//    public int update(BoardVO board);

    void delBoard(BoardVO boardVO);




}
