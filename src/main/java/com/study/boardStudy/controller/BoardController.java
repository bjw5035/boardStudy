package com.study.boardStudy.controller;

import com.study.boardStudy.service.BoardService;
import org.apache.maven.model.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    private final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService boardService;
    
    /**
     * 게시판 홈 화면
     */
    @GetMapping(value = "/board/Board")
    public String boardView(Model model) {
        logger.info("board view <<<<< 게시판 홈 화면");

        return "/board/Board";
    }

}
