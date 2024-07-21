package com.example.boardStudy.controller;

import com.example.boardStudy.service.UserService;
import com.example.boardStudy.vo.UserVO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@RequestMapping("/")
@Controller
public class AdminController {

    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(UserVO userVO) throws Exception{
        log.info("login Controller >>>");
        String user = userService.login(userVO);

        if (!user.equals(userVO)) {
            return "redirect:/login";
        } else {

        }

        return "login";
    }

//    @GetMapping("/logout")
    @RequestMapping("/logout")
    public String logOut(HttpServletRequest request) throws Exception{

        HttpSession session = request.getSession();

        session.invalidate();

        return "home";
    }
}
