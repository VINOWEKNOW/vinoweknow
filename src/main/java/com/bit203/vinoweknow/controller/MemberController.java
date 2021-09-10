package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.dao.MemberDao;
import com.bit203.vinoweknow.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/member")
@Slf4j
@Controller
public class MemberController {

    @Autowired
    private MemberDao memberDao;

    // index
    @GetMapping("/")
    public String index() {
        return "redirect:/main";
    }

    //회원 가입
    @RequestMapping("/join")
    public int memberJoin(MemberVO member, HttpServletRequest request) {

        // parameter check
        log.info("member ############################");
        log.info(request.getParameter("memberId"));
        System.out.println("member controller ## memberJoin");
        System.out.println(member.toString());

        // call method(interface)
        int result = memberDao.insertMember(member);

        System.out.println("call insert member after");
        System.out.println(result);
        // result 0이면 성공인지, 1이면 성공인지 확인

        return result;
    }

    //회원 조회
    @RequestMapping("/list")
    public String memberSearch(MemberVO member, HttpServletRequest request) {
        List<MemberVO> memberList = memberDao.memberList();
        return "";
    }

    //회원 정보 조회

    //회원 목록 조회

    //회원 탈퇴
}
