package com.study.boardStudy.dao.admin;

import com.study.boardStudy.vo.ContentVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDAO {

    boolean boardDelete(int seq) throws Exception;

    /* 게시글 상세 조회 */
    ContentVO findOneSelect(int seq) throws Exception;
}
