package com.study.boardStudy.controller;

import com.study.boardStudy.service.UserService;
import com.study.boardStudy.vo.SignupVO;
import com.study.boardStudy.vo.LoginVO;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserService userService;

    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 로그인 페이지
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/auth/Login")
    public String loginPage() throws Exception {
        logger.info("Login Page 입니다.");
        return "/auth/Login";
    }

    /**
     * 로그인 기능 로직
     *
     * @param userId
     * @param userPw
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/auth/Login")
    public String login(@RequestParam("userId") String userId, @RequestParam("userPw") String userPw) throws Exception {

        boolean login = userService.login(userId, userPw);

        if (login) {
            return "redirect:/board/Board";
        } else {
            return "redirect:/auth/Login";
        }

    }

    /**
     * 회원가입
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/auth/Signup")
    public String signUpGet() throws Exception {
        return "/auth/Signup";
    }
    
    @PostMapping(value = "/auth/Signup")
    public String signUpPost(SignupVO signupVO) throws Exception {
        boolean join = userService.join(signupVO);
        if (join) {
            return "redirect:/auth/Login";
        } else {
            return "/auth/Signup";
        }
    }
}
