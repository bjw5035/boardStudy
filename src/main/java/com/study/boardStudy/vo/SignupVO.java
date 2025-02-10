package com.study.boardStudy.vo;

import lombok.Getter;

@Getter
public class SignupVO {

    private final String joinId;
    private final String joinName;
    private final String joinPw;

    public SignupVO(String joinId, String joinName, String joinPw) {
        this.joinId = joinId;
        this.joinName = joinName;
        this.joinPw = joinPw;
    }
}
