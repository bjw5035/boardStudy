package com.example.boardStudy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class adminController {


    @GetMapping("/login")
    public String login(@RequestParam String userId) throws Exception{

        try {

//            String result = userService.login(userId);

        } catch (Exception e) {
            throw new Exception("id가 다릅니다");
        }

        return "login";
    }

    @GetMapping("/logout")
    public String logOut(HttpServletRequest request) throws Exception{

        HttpSession session = request.getSession();

        session.invalidate();

        return "home";
    }
}
