package com.study.boardStudy.service;

import com.study.boardStudy.vo.SignupVO;
import com.study.boardStudy.vo.LoginVO;

public interface UserService {

    boolean join(SignupVO signupVO);
    void login(LoginVO loginVO) throws Exception;

}

