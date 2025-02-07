package com.study.boardStudy.dao.admin;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostDAO {

    void postInsert(int id, String title, String content, String writer);
}
