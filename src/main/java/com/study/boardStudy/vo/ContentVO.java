package com.study.boardStudy.vo;

import lombok.Getter;

@Getter
public class ContentVO {

    private final String title;
    private final String content;

    public ContentVO(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
