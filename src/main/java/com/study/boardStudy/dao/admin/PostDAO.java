package com.study.boardStudy.dao.admin;

import com.study.boardStudy.dto.ContentDTO;
import com.study.boardStudy.vo.ContentVO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostDAO {

    /* 게시글 작성 */
    int postInsert(ContentDTO contentDTO);

    /* 게시글 리스트 */
    List<ContentVO> contentSelect(ContentDTO contentDTO);

    /* 게시글 검색 기능*/
    List<ContentVO> findSelect(String searchBox);

}
