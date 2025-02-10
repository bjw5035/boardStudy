package com.study.boardStudy.dao.admin;

import com.study.boardStudy.dto.ContentDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostDAO {

    int postInsert(ContentDTO contentDTO);

    ContentDTO contentSelect(int id);
}
