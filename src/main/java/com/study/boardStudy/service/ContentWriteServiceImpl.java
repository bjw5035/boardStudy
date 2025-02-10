package com.study.boardStudy.service;

import com.study.boardStudy.dao.admin.PostDAO;
import com.study.boardStudy.vo.PostVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentWriteServiceImpl implements ContentWriteService {

    private Logger logger = LoggerFactory.getLogger(ContentWriteServiceImpl.class);

    @Autowired
    private PostDAO postDAO;

    @Override
    public void contentInsert(PostVO postVO) {
        postDAO.postInsert(postVO);
    }
}
