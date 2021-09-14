package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.MagazineVO;
import com.bit203.vinoweknow.vo.NewsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MagazineDAO {

    //뉴스 리스트
    List<NewsVO> listNews();

    //뉴스 생성
    void createNews(NewsVO newsVO);

    //뉴스 수정
    void updateNews(NewsVO newsVO);

    //뉴스 조회
    void readNews(NewsVO newsVO);

    //뉴스 삭제
    void deleteNews(NewsVO newsVO);

}


