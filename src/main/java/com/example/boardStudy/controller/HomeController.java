package com.example.boardStudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String mainHome() {
        return "home";
    }



}
