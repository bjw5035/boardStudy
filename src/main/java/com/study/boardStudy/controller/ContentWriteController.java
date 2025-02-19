package com.study.boardStudy.controller;

import com.study.boardStudy.dto.ContentDTO;
import com.study.boardStudy.service.ContentWriteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller(value = "/contentWrite")
public class ContentWriteController {

    private final Logger logger = LoggerFactory.getLogger(ContentWriteController.class);

    @Autowired
    private ContentWriteService contentWriteService;

    /**
     * 글 작성 화면
     */
    @GetMapping(value = "/contentWrite/Write")
    public String contentView() {
        logger.info("contentWrite view <<<<<<<<<<<<<< 게시글 작성 화면");
        return "/contentWrite/Write";
    }

    /**
     * 게시글 작성
     *
     * @param title
     * @param content
     * @return
     */
    @PostMapping(value = "/contentWrite/Write")
    public String contentWrite(String title, String content) {

        ContentDTO contentDTO = new ContentDTO();
        contentDTO.setTitle(title);
        contentDTO.setContent(content);

        logger.info("Controller contentWrite view : {}", contentDTO);

        boolean contentInsert = contentWriteService.contentInsert(contentDTO);
        logger.info("Content insert : {}", contentInsert);

        if (!contentInsert) {
            return "redirect:/contentWrite/Write";
        }

        return "redirect:/board/Board";

    }

}
