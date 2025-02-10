package com.study.boardStudy.service;

import com.study.boardStudy.dao.admin.BoardDAO;
import com.study.boardStudy.dao.admin.PostDAO;
import com.study.boardStudy.dto.ContentDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    private final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);

    @Autowired
    private BoardDAO boardDAO;
    @Autowired
    private PostDAO postDAO;

    @Override
    public String contentSelect(ContentDTO contentDTO) throws Exception {
        return "";
    }

    ;
}
