package com.study.boardStudy.service;

import com.study.boardStudy.dto.ContentDTO;
import com.study.boardStudy.vo.ContentVO;
import java.util.List;

public interface BoardService {

    /* 게시글 리스트 */
    List<ContentVO> contentSelect(ContentDTO contentDTO) throws Exception;

    /* 게시글 검색 */
    List<ContentVO> findSelect(String searchBox) throws Exception;

    /* 게시글 삭제 */
    boolean delContent(int seq) throws Exception;
}
