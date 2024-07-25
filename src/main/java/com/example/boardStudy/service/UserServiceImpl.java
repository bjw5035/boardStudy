package com.example.boardStudy.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public String login() throws Exception {

        String text = "login";
        System.out.println(text);
//        return login("test");
        return text;
    }
}
