package com.example.boardStudy.controller;

import com.example.boardStudy.vo.PostVO;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private Logger logger = LoggerFactory.getLogger(BoardController.class);

    @RequestMapping(value = "/Board", method = RequestMethod.GET)
    public String boardView(Model model) {
        return "/board/Board";
    }

    @RequestMapping(value = "/Write", method = RequestMethod.POST)
    public String writeView(Model model) {
        return "/board/Write";
    }

    @GetMapping(value = "/Write")
    public String contentWrite(@SessionAttribute(name = "userId", required = false) String userId, Model model) {

        if (userId == null) {
            return "/auth/Login";
        }

        List<PostVO> postList = new ArrayList<>();
        postList.add(new PostVO(1, "첫 번째 글", "관리자", "2024-12-13"));
        postList.add(new PostVO(2, "두 번째 글", "사용자1", "2024-12-12"));

        model.addAttribute("postList", postList);
//        return "Write";
        return model.toString();
    }

}
