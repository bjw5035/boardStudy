package com.example.boardStudy.service;

import com.example.boardStudy.dao.admin.BoardDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    private Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);

    private BoardDao boardDao;

    public String content(int id, String title, String content, String author) {

        try{
            boardDao.boardInsert(id, title, content, author);
            logger.info("Post Success");
        }catch (Exception e){
            logger.error(e.getMessage() + "Post Error");
            e.printStackTrace();
        }

        return "Post Success";
    };
}
