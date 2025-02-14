package com.study.boardStudy.controller;

import com.study.boardStudy.dto.ContentDTO;
import com.study.boardStudy.service.BoardService;
import com.study.boardStudy.vo.ContentVO;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {

    private final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService boardService;

    /**
     * 게시판 홈 화면
     */
    @GetMapping(value = "/board/Board")
    public void boardView(ContentDTO contentDTO, Model model) throws Exception {
        logger.info("board view <<<<< 게시판 홈 화면");

        List list = boardService.contentSelect(contentDTO);
        model.addAttribute("postList", list);
    }

    /**
     * 게시판 검색 기능
     */
    @GetMapping(value = "/{searchBox}")
    public void findSelect(Model model, @PathVariable String searchBox) throws Exception {
        //TODO 2025-02-14 mapping 에러 수정 필요(No mapping for POST /board/board/Board/%7BsearchBox%7D)
//    public void findSelect(@RequestParam(value = "searchBox") String searchBox, Model model, @PathVariable String searchBox) throws Exception {
        logger.info("search : {}", searchBox);
        List<ContentVO> select = boardService.findSelect(searchBox);
        model.addAttribute("postList", select);
    }
}
