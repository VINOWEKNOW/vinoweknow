package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.MagazineVO;
import com.bit203.vinoweknow.vo.NewsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MagazineDAO {


    List<NewsVO> listNews();
    //게시글 리스트
    List<MagazineVO> listMagazine() throws Exception;

    //게시글 생성
    void createNews(MagazineVO magazineVO) throws Exception;

    void createKnow(MagazineVO magazineVO) throws  Exception;
    //게시글 수정
    void updateMagazine(MagazineVO magazineVO) throws Exception;

    //게시글 삭제
    void deleteMagazine(MagazineVO magazineVO) throws Exception;

    //게시글 조회
    MagazineVO readNews(int newsCode) throws Exception;
    MagazineVO readKnow(int knowCode) throws Exception;
    MagazineVO readVote(int voteCode) throws Exception;
}
