package com.study.boardStudy.service;

import com.study.boardStudy.dto.SignupDTO;

public interface UserService {

    boolean join(SignupDTO signupDTO);

    boolean login(String userId, String userPw);
}

