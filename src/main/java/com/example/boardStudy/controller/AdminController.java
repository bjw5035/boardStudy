package com.example.boardStudy.controller;

import com.example.boardStudy.service.UserService;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AdminController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

//    @Autowired
//    public AdminController(UserService userService) {
//        this.userService = userService;
//    }

    /* 홈 화면 페이지*/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        return "Home";
    }

    /*
     * 로그인 페이지
     * */
    @RequestMapping(value = "/Login", method = RequestMethod.GET)
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
    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public String login(@RequestParam("userId") String userId, @RequestParam("userPw") String userPw, Model model, HttpSession session) throws Exception {
        logger.info("userId : " + userId);
        logger.info("Data userId: " + userId + "userPw : " + userPw);

        if (userId.length() != 0 || userPw.length() != 0) {
            session.setAttribute("userId", userId);
            return "redirect:/board/Board";
        } else {
            return "redirect:/error/LoginError";
        }
    }

}
