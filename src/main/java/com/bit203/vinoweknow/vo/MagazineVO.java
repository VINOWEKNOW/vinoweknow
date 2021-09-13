package com.bit203.vinoweknow.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Data
@Component
public class MagazineVO {

    //뉴스
    List<NewsVO> newsVOList;

    //상식
    List<KnowVO> knowVOList;

    //투표
    List<VoteVO> voteVOList;


}
