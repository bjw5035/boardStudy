package com.study.boardStudy.controller;

import com.study.boardStudy.dto.LoginDTO;
import com.study.boardStudy.dto.SignupDTO;
import com.study.boardStudy.service.UserService;
import com.study.boardStudy.vo.LoginVO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    /**
     * 로그인 페이지
     *
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
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/auth/Login")
    public String login(LoginDTO loginDTO, HttpServletRequest request) throws Exception {
//    public String login(@RequestParam("userId") String userId, @RequestParam("userPw") String userPw, HttpServletRequest request) throws Exception {

//        boolean login = userService.login(userId, userPw);
        LoginVO login = userService.login(loginDTO);

        if (!login.getUserId().isEmpty() || login.getUserName() != null && !login.getUserName().isEmpty()) {
            String userId = login.getUserId();
            String userName = login.getUserName();
            HttpSession session = request.getSession();
            session.setAttribute("userId", userId);
            session.setAttribute("userName", userName);
            return "redirect:/board/Board";
        } else {
            return "redirect:/auth/Login";
        }

    }

    @GetMapping(value = "/auth/Signup")
    public String signUpGet() throws Exception {
        logger.info("회원가입 페이지 입니다.");
        return "/auth/Signup";
    }

    /**
     * 회원가입 기능
     *
     * @param signupDTO
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/auth/Signup")
    public String signUpPost(SignupDTO signupDTO) throws Exception {
        boolean join = userService.join(signupDTO);
        if (join) {
            return "redirect:/auth/Login";
        } else {
            return "redirect:/auth/Signup";
        }
    }

    /**
     * 로그아웃
     */
    @GetMapping(value = "/auth/Logout")
    public String logout(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "redirect:/auth/Login";
    }

}
