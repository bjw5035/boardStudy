package com.example.boardStudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class homeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}
