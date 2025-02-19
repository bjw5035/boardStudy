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

    @Override
    public List<ContentVO> findSelect(String searchBox) throws Exception {
        if (searchBox == null || searchBox.isEmpty()) {
            throw new IllegalArgumentException("ServiceImpl searchBox is null or empty");
//            return postDAO.contentSelect(null);
        }

        List<ContentVO> findSelect = postDAO.findSelect(searchBox.trim());
        logger.info("findSelect: {}", findSelect);

        return findSelect;
    }

    @Override
    public boolean delContent(int seq) throws Exception {
        return boardDAO.boardDelete(seq);
    }

    @Override
    public ContentVO findOneContent(int seq) throws Exception {

        if (seq < 1) {
            throw new IllegalArgumentException("ServiceImpl searchBox is null or empty");
        }

        ContentVO oneSelect = boardDAO.findOneSelect(seq);
        logger.info("findOneSelect: {}", oneSelect.getSeq());

        return oneSelect;
    }


}
