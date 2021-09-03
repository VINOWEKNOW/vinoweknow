package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {

    void insertMember(MemberVO member);

    void selectMember(MemberVO member);

    List<MemberVO> memberList();

    void updateMember(MemberVO member);

    void deleteMember(MemberVO member);
}
