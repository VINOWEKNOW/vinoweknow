package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.WineVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WineDao {

    //와인 등록
    String insertWine(WineVO insertWine);

    //와인 조회
    void selectWine(WineVO selectWine);

    //와인 리스트 조회
    List<WineVO> wineList();

    //와인 수정
    void updateWine(WineVO updateWine);

    //와인 삭제
    void deleteWine(WineVO deleteWine);

}
