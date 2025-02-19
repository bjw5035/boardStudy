package com.study.boardStudy.dto;

import lombok.Getter;
import lombok.Setter;

/*
 * Annotation을 사용하지 않고 직접적으로 사용해 보기위함
 * */
@Setter
@Getter
public class LoginDTO {

    private int seq;
    private String userId;
    private String userPw;
    private String userName;

    public LoginDTO(String userId, String userPw) {
        if (userId == null || userId.isEmpty()) {
            throw new IllegalStateException("userId is null or empty");
        }
        if (userPw == null || userPw.isEmpty()) {
            throw new IllegalStateException("userPw is null or empty");
        }
        this.userId = userId;
        this.userPw = userPw;
    }

    public LoginDTO() {
    }

    public LoginDTO(int seq, String userId, String userPw, String userName) {
        this.seq = seq;
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
            "seq=" + seq +
            ", userId='" + userId + '\'' +
            ", userPw='" + userPw + '\'' +
            ", userName='" + userName + '\'' +
            '}';
    }
}
