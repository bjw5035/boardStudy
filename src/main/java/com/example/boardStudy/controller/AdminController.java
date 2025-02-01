package com.example.boardStudy.controller;

import com.example.boardStudy.service.UserService;
import com.example.boardStudy.vo.UserVO;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class AdminController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired private UserService userService;

    /*
     * 로그인 페이지
     * */
    @GetMapping(value = "/auth/Login")
    public String loginPage() throws Exception {
        logger.info("Login Page 이동입니다.");
        return "/auth/Login";
    }

    /**
     * 로그인 기능 로직
     * @param userId
     * @param userPw
     * @param model
     * @param session
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/auth/Login")
    public void login(@RequestParam("userId") String userId, @RequestParam("userPw") String userPw, Model model, HttpSession session) throws Exception {
        logger.info("userId : " + userId);
        logger.info("Data userId: " + userId + "userPw : " + userPw);

        UserVO userVO = new UserVO();
        userVO.setUserId(userId);
        userVO.setUserPw(userPw);
        logger.info("userVO : " + userVO);

        userService.login(userVO);

    }

}
