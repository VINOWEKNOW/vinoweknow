package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {

    //회원가입
    int insertMember(MemberVO member);

    //회원조회
    void selectMember(MemberVO member);

    //회원 목록 조회
    List<MemberVO> memberList();

    // 회원 정보 수정
    void updateMember(MemberVO member);

    //회원 탈퇴/삭제
    void deleteMember(MemberVO member);
}