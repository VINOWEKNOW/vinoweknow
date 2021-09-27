package com.bit203.vinoweknow.service;

import com.bit203.vinoweknow.vo.KnowVO;
import com.bit203.vinoweknow.vo.NewsVO;
import com.bit203.vinoweknow.vo.VoteVO;

import java.util.List;

public interface MagazineService {
    //뉴스 리스트
    List<NewsVO> listNews();

    //뉴스 생성
    void createNews(NewsVO newsVO);

    //뉴스 작성
    void insertNews(NewsVO newsVO);

    //뉴스 수정
    void updateNews(NewsVO newsVO);

    //뉴스 조회
    void readNews(NewsVO newsVO);

    //뉴스 삭제
    void deleteNews(NewsVO newsVO);

    //상식 리스트
    List<KnowVO> listKnow();

    //상식 생성
    void createKnow(KnowVO knowVO);

    //상식 수정
    void updateKnow(KnowVO knowVO);

    //상식 조회
    void readKnow(KnowVO knowVO);

    //상식 삭제
    void deleteKnow(KnowVO knowVO);

    //투표 리스트
    List<VoteVO> listVote();

    //투표 생성
    void createVote(VoteVO voteVO);

    //투표 수정
    void updateVote(VoteVO voteVO);

    //투표 조회
    void readVote(VoteVO voteVO);

    //투표 삭제
    void deleteVote(VoteVO voteVO);
}
