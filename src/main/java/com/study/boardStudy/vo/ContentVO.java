package com.study.boardStudy.vo;

import lombok.Getter;

@Getter
public class ContentVO {

    private final int seq;
    private final String title;
    private final String content;

    public ContentVO(int seq, String title, String content) {
        this.seq = seq;
        this.title = title;
        this.content = content;
    }
}
