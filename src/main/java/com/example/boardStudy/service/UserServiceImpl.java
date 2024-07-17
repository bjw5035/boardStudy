package com.example.boardStudy.service;

import com.example.boardStudy.mappers.UserMapper;
import com.example.boardStudy.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserVO userVO;

    @Autowired
    UserMapper userMapper;

    public String login(String userId) throws Exception{

        return userMapper.memberLogin(userId);
    }

}
