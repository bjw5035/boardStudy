package com.study.boardStudy.service;

import com.study.boardStudy.dao.admin.BoardDAO;
import com.study.boardStudy.dao.admin.PostDAO;
import com.study.boardStudy.dto.ContentDTO;
import com.study.boardStudy.vo.ContentVO;
import java.util.List;
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
    public List<ContentVO> contentSelect(ContentDTO contentDTO) throws Exception {
        return postDAO.contentSelect(contentDTO);
    }

}
