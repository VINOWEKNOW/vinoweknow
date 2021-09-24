package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.QuestionsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionsDAO {

    List<QuestionsVO> listQuestions();

    void createQuestions(QuestionsVO questionsVO);

    void delQuestions(QuestionsVO questionVO);
}
