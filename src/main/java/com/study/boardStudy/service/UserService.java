package com.study.boardStudy.service;

import com.study.boardStudy.dto.LoginDTO;
import com.study.boardStudy.dto.SignupDTO;
import com.study.boardStudy.vo.LoginVO;

public interface UserService {

    /* 로그인 */
//    boolean login(String userId, String userPw);
    LoginVO login(LoginDTO loginDTO);

    /* 회원가입 */
    boolean join(SignupDTO signupDTO);
}

