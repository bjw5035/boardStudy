package com.study.boardStudy.vo;

import lombok.Getter;

@Getter
public class ContentVO {

    private final int seq;
    private final String title;
    private final String content;
    private final String userId;
    private final String userName;

    public ContentVO(int seq, String title, String content, String userId, String userName) {
        this.seq = seq;
        this.title = title;
        this.content = content;
        this.userId = userId;
        this.userName = userName;
    }

}
