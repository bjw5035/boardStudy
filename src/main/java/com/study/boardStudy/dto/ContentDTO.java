package com.study.boardStudy.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContentDTO {

    private int seq;
    private String title;
    private String content;
    private String userId;
    private String userName;

    public ContentDTO() {
    }

    public ContentDTO(int seq) {
        this.seq = seq;
    }

    public ContentDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public ContentDTO(int seq, String title, String content) {
        this.seq = seq;
        this.title = title;
        this.content = content;
    }

    public ContentDTO(int seq, String title, String content, String username) {
        this.seq = seq;
        this.title = title;
        this.content = content;
        this.userName = username;
    }

    public ContentDTO(int seq, String title, String content, String userId, String username) {
        this.seq = seq;
        this.title = title;
        this.content = content;
        this.userName = username;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ContentDTO{" +
            "seq=" + seq +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", username='" + userName + '\'' +
            ", userId='" + userId + '\'' +
            '}';
    }
}
