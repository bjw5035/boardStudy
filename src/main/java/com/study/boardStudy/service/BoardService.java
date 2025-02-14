package com.study.boardStudy.service;

import com.study.boardStudy.dto.ContentDTO;
import com.study.boardStudy.vo.ContentVO;
import java.util.List;

public interface BoardService {

    /* 게시글 리스트 */
    List<ContentVO> contentSelect(ContentDTO contentDTO) throws Exception;

    /* 게시글 검색 기능*/
    List<ContentVO> findSelect(String title) throws Exception;
}
