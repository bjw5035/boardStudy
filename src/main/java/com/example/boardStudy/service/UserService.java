package com.example.boardStudy.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public String login(String userId) throws Exception;

}
