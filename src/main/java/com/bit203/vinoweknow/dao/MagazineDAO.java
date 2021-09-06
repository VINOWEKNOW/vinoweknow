package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.MagazineVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MagazineDAO {

    List<MagazineVO> listMagazine() throws Exception;
    void createMagazine(MagazineVO magazineVO) throws Exception;
    void updateMagazine(MagazineVO magazineVO) throws Exception;
    void deleteMagazine(MagazineVO magazineVO) throws Exception;

}
