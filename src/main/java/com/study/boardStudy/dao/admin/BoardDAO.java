package com.study.boardStudy.dao.admin;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDAO {

    boolean boardDelete(int seq) throws Exception;
}
