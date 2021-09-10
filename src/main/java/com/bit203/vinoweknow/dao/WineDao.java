package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.WineVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WineDao {
    List<WineVO> wineList();
}
