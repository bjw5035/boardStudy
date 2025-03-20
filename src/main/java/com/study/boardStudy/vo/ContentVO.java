package com.study.boardStudy.vo;

import lombok.Getter;

@Getter
public class ContentVO {

    private final int seq;
    private final String title;
    private final String content;
    private final String userId;
    private final String userName;
    private final String createTime;

    public ContentVO(int seq, String title, String content, String userId, String userName, String createTime) {
        this.seq = seq;
        this.title = title;
        this.content = content;
        this.userId = userId;
        this.userName = userName;
        this.createTime = createTime;
    }

}
