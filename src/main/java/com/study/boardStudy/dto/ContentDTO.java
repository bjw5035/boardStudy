package com.study.boardStudy.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContentDTO {

    private int seq;
    private String title;
    private String content;
//    private String name;

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

    @Override
    public String toString() {
        return "ContentDTO{" +
            "title='" + title + '\'' +
            ", content='" + content + '\'' +
            '}';
    }
}
