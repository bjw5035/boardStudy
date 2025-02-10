package com.study.boardStudy.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupDTO {

    private String joinId;
    private String joinName;
    private String joinPw;

    public SignupDTO() {
    }

    public SignupDTO(String joinId, String joinName, String joinPw) {
        this.joinId = joinId;
        this.joinName = joinName;
        this.joinPw = joinPw;
    }

    @Override
    public String toString() {
        return "JoinVO{" +
            "joinId=" + joinId +
            ", joinName='" + joinName + '\'' +
            ", joinPw='" + joinPw + '\'' +
            '}';
    }
}
