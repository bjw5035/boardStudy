package com.study.boardStudy.dao.admin;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDAO {

    void boardInsert(int id, String title, String content, String writer);
}
