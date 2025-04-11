package com.study.boardStudy.controller;

import com.study.boardStudy.dto.ContentDTO;
import com.study.boardStudy.service.BoardService;
import com.study.boardStudy.vo.ContentVO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

    private final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService boardService;

    /**
     * 게시글 홈 화면
     */
    @GetMapping(value = "/board/Board")
    public void boardView(ContentDTO contentDTO, Model model, HttpServletRequest request) throws Exception {
        logger.info("board view <<<<< 게시판 홈 화면");

        List<ContentVO> list = boardService.contentSelect(contentDTO);
        model.addAttribute("postList", list);
    }

    /**
     * 게시글 삭제
     */
    @GetMapping(value = "/Board/btnDel")
    public String deleteContent(@RequestParam(value = "seqList", required = false) List<Integer> seqList) throws Exception {

        boolean delContent = false;

        if (seqList == null || seqList.isEmpty()) {
            for (Integer seq : seqList) {
                delContent = boardService.delContent(seq);
            }
        }
        if (!delContent) {
            throw new Exception("del content fail");
        }
        return "redirect:/board/Board";
    }

    /**
     * 게시글 검색 기능
     */
    @GetMapping(value = "/Board/searchBox")
    public String findSelect(@RequestParam(value = "searchBox", required = false) String searchBox, Model model) throws Exception {
        if (searchBox == null || searchBox.isEmpty()) {
            logger.info("search : {}", searchBox);
            throw new IllegalStateException("Controller searchBox is null");
        }

        List<ContentVO> select = boardService.findSelect(searchBox);
        model.addAttribute("postList", select);

        return "/board/Board";
    }

    /**
     * 게시글 상세 조회
     */
    @GetMapping(value = "/Board/Detail")
    public String boardDetail(@RequestParam(value = "seq") int seq, Model model) throws Exception {
        ContentVO oneContent = boardService.findOneContent(seq);
        if (oneContent == null || oneContent.getSeq() != seq || oneContent.getSeq() == 0) {
            throw new Exception("board detail fail");
        }
        model.addAttribute("post", oneContent);

        return "board/Detail";
    }
}
