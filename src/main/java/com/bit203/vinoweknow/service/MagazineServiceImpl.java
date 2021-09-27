package com.bit203.vinoweknow.service;

import com.bit203.vinoweknow.dao.MagazineDAO;
import com.bit203.vinoweknow.vo.KnowVO;
import com.bit203.vinoweknow.vo.NewsVO;
import com.bit203.vinoweknow.vo.VoteVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagazineServiceImpl implements MagazineService {

    @Autowired
    private MagazineDAO magazineDAO;

    @Override
    public List<NewsVO> listNews() {
        return magazineDAO.listNews();
    }

    @Override
    public void createNews(NewsVO newsVO) {

    }

    @Override
    public void insertNews(NewsVO newsVO) {

    }

    @Override
    public void updateNews(NewsVO newsVO) {

    }

    @Override
    public void readNews(NewsVO newsVO) {

    }

    @Override
    public void deleteNews(NewsVO newsVO) {

    }

    @Override
    public List<KnowVO> listKnow() {
        return null;
    }

    @Override
    public void createKnow(KnowVO knowVO) {

    }

    @Override
    public void updateKnow(KnowVO knowVO) {

    }

    @Override
    public void readKnow(KnowVO knowVO) {

    }

    @Override
    public void deleteKnow(KnowVO knowVO) {

    }

    @Override
    public List<VoteVO> listVote() {
        return null;
    }

    @Override
    public void createVote(VoteVO voteVO) {

    }

    @Override
    public void updateVote(VoteVO voteVO) {

    }

    @Override
    public void readVote(VoteVO voteVO) {

    }

    @Override
    public void deleteVote(VoteVO voteVO) {

    }
}
