package com.study.boardStudy.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostVO {

    private String title;
    private String content;

    public PostVO() {
    }

    public PostVO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "PostVO{" +
            "title='" + title + '\'' +
            ", content='" + content + '\'' +
            '}';
    }
}
