package com.study.boardStudy.vo;

import lombok.Getter;

@Getter
public class LoginVO {

    private final String userId;
    private final String userPw;

    public LoginVO(String userId, String userPw) {
        this.userId = userId;
        this.userPw = userPw;
    }
}
