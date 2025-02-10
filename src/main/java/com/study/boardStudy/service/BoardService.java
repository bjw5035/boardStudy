package com.study.boardStudy.service;

import com.study.boardStudy.dto.ContentDTO;

public interface BoardService {

    String contentSelect(ContentDTO contentDTO) throws Exception;
}
