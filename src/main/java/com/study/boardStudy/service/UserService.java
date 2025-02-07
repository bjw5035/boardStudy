package com.study.boardStudy.service;

import com.study.boardStudy.vo.SignupVO;
import com.study.boardStudy.vo.LoginVO;
import java.util.Map;

public interface UserService {

    boolean join(SignupVO signupVO);

    boolean login(String userId, String userPw);
}

