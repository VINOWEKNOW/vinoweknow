package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.MemberVO;

import java.util.ArrayList;

public interface MemberDao {
    void insertMem();
    void deleteMem();
    ArrayList<MemberVO> memList();
    MemberVO searchMem();
    void login();
    void logout();
}
