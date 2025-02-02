package com.example.boardStudy.service;

import com.example.boardStudy.vo.JoinVO;
import com.example.boardStudy.vo.LoginVO;

public interface UserService {

    JoinVO join(JoinVO joinVO);
    void login(LoginVO loginVO) throws Exception;

}

