package com.example.boardStudy.controller;

import com.example.boardStudy.service.UserService;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

//    @Autowired
//    public AdminController(UserService userService) {
//        this.userService = userService;
//    }

    @RequestMapping(value = "/auth/Login", method = RequestMethod.GET)
    public String loginPage() {
        logger.info("Login Page 이동입니다.");
        return "Login";
    }

    @RequestMapping(value = "/auth/Login", method = RequestMethod.POST)
    public String login(@RequestParam("userId") String userId,@RequestParam("userPw") String userPw, HttpSession session) throws Exception {
        logger.info("login");
        logger.info("Data userId: " + userId + "userPw : " + userPw);
        if (userService.login(userId, userPw)) {
            session.setAttribute("userId", userId);
            return "redirect:/Board";
        } else {
            return "redirect:/error/LoginError";
        }
    }

    @RequestMapping(value = "/error/LoginError", method = RequestMethod.GET)
    public String loginErrorPage() {
        logger.info("Login Error Page입니다.");
        return "/LoginError";
    }
}
