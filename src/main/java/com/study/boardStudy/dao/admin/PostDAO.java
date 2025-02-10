package com.study.boardStudy.dao.admin;

import com.study.boardStudy.vo.PostVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostDAO {

    void postInsert(PostVO postVO);
}
