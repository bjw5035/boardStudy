package com.study.boardStudy.service;

import com.study.boardStudy.dto.SignupDTO;

public interface UserService {

    /* 로그인 */
    boolean login(String userId, String userPw);

    /* 회원가입 */
    boolean join(SignupDTO signupDTO);
}

