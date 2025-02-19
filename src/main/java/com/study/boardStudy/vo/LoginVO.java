package com.study.boardStudy.vo;

import lombok.Getter;

@Getter
public class LoginVO {

    private final int seq;
    private final String userId;
    private final String userPw;
    private final String userName;

    public LoginVO(int seq, String userId, String userPw, String userName) {
        this.seq = seq;
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
    }
}
