package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.MagazineVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {

    void insertMember(MagazineVO member);
}
