package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardDAO {

    //@Select("select boardCode, boardName, boardWriter, boardDate, boardView, boardState from board")

    public List<BoardVO> selectBoardList();

    public int insertBoard(BoardVO board);

    //void selectBoard(BoardVO board);

    public int update(BoardVO board);

    public int delBoard(int boardCode);



}
