package com.example.boardStudy.dao.admin;

import org.springframework.stereotype.Repository;

@Repository
public interface BoardDao {

    String boardInsert(int id, String title, String content, String writer) throws Exception;
}
