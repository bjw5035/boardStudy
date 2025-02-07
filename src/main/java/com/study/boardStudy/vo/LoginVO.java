package com.study.boardStudy.vo;

import lombok.Getter;
import lombok.Setter;

/*
* Annotation을 사용하지 않고 직접적으로 사용해 보기위함
* */
@Setter
@Getter
public class LoginVO {

    private String userId;
    private String userPw;

    public LoginVO(String userId, String userPw) {
        if (userId == null || userId.isEmpty()) {
            throw new IllegalStateException("userId is null or empty");
        }
        if (userPw == null || userPw.isEmpty()) {
            throw new IllegalStateException("userPw is null or empty");
        }
        this.userId = userId;
        this.userPw = userPw;
    }

    public LoginVO() {}

    @Override
    public String toString() {
        return "UserVO{" +
            "userId='" + userId + '\'' +
            ", userPw='" + userPw + '\'' +
            '}';
    }
}
