package com.study.boardStudy.controller;

import com.study.boardStudy.service.ContentWriteService;
import com.study.boardStudy.vo.PostVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller(value = "/contentWrite")
public class ContentWriteController {

    private final Logger logger = LoggerFactory.getLogger(ContentWriteController.class);

    private final ContentWriteService contentWriteService;

    public ContentWriteController(ContentWriteService contentWriteService) {
        this.contentWriteService = contentWriteService;
    }

    /**
     * 글 작성 화면
     */
    @GetMapping(value = "/contentWrite/Write")
    public String contentView() {
        logger.info("contentWrite view");
        return "/contentWrite/Write";
    }


    @PostMapping(value = "/contentWrite/Write")
    public void contentWrite(String title, String content, Model model) {

        PostVO postVO = new PostVO();
        postVO.setTitle(title);
        postVO.setContent(content);
        contentWriteService.contentInsert(postVO);

//        List<PostVO> postList = new ArrayList<>();
//        postList.add(new PostVO("테스트1", "글쓰기 테스트1"));
//        postList.add(new PostVO("테스트2", "글쓰기 테스트2"));
//
//        model.addAttribute("postList", postList);
//        return model.toString();
    }

}
