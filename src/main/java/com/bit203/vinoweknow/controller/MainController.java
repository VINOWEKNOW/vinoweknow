package com.bit203.vinoweknow.controller;

import com.bit203.vinoweknow.dao.MemberDao;
import com.bit203.vinoweknow.dao.WineDao;
import com.bit203.vinoweknow.vo.MemberVO;
import com.bit203.vinoweknow.vo.WineVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private WineDao wineDao;

    // index
    @RequestMapping(value={"", "/", "/main"})
    public void index() {
        System.out.println("main index 진입 #####");

        List<WineVO> recommendWineList  = wineDao.wineList();
    }

}
