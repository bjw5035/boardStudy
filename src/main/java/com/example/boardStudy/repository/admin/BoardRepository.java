package com.example.boardStudy.repository.admin;

import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository {

    void boardInsert(int id, String title, String content, String writer) throws Exception;
}
