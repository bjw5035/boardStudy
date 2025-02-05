package com.study.boardStudy.service;

import com.study.boardStudy.vo.SignupVO;
import com.study.boardStudy.vo.LoginVO;

public interface UserService {

    SignupVO join(SignupVO signupVO);
    void login(LoginVO loginVO) throws Exception;

}

