package com.example.boardStudy.controller;

import com.example.boardStudy.service.UserService;
import com.example.boardStudy.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @Autowired
    UserService userService;

//    @Autowired
//    public AdminController(UserService userService) {
//        this.userService = userService;
//    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@RequestParam String userId, String userPw) throws Exception {
        userService.login(userId, userPw);
    }
}
