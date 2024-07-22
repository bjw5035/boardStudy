package com.example.boardStudy.controller;

import com.example.boardStudy.service.UserService;
import com.example.boardStudy.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    private final UserService userService;
    private final UserVO userVO;

    @Autowired
    public AdminController(UserService userService, UserVO userVO) {
        this.userService = userService;
        this.userVO = userVO;
    }

    //    @GetMapping("/login")
//    public String loginPage() {
//        return "login";
//    }
    @GetMapping("/login")
    public String login() {

        return "login";
    }
}
