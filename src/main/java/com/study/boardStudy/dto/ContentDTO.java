package com.study.boardStudy.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContentDTO {

    private String title;
    private String content;

    public ContentDTO() {
    }

    public ContentDTO(String title, String content) {
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
