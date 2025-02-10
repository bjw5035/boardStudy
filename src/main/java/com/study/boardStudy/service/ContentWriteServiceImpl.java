package com.study.boardStudy.service;

import com.study.boardStudy.dao.admin.PostDAO;
import com.study.boardStudy.dto.ContentDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentWriteServiceImpl implements ContentWriteService {

    private final Logger logger = LoggerFactory.getLogger(ContentWriteServiceImpl.class);

    @Autowired
    private PostDAO postDAO;

    @Override
    public boolean contentInsert(ContentDTO contentDTO) {

        int contentDto = postDAO.postInsert(contentDTO);
        logger.info("contentDto : " + contentDTO.toString());

        if (contentDto == 0) {
            throw new IllegalStateException("content insert failed");
        }

        return true;
    }
}
