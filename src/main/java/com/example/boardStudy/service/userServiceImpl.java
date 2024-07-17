package com.example.boardStudy.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class userServiceImpl implements userService{


    @Autowired
    userService userService;

    public String login(String userId) throws Exception{
        return userService.login(userId);
    }
}
