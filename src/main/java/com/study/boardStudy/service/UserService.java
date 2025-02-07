package com.study.boardStudy.service;

import com.study.boardStudy.vo.SignupVO;
import com.study.boardStudy.vo.LoginVO;
import java.util.Map;

public interface UserService {

    boolean join(SignupVO signupVO);
    String login(String userId, String userPw);

    Map<String, Object> validateLogin(Map<String, Object> map);

}

