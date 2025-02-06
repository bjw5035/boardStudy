package com.study.boardStudy.service;

import com.study.boardStudy.vo.SignupVO;
import com.study.boardStudy.vo.LoginVO;

public interface UserService {

    boolean join(SignupVO signupVO);
    String login(String userId, String userPw);
//    boolean validateLogin(LoginVO loginVO);

}

