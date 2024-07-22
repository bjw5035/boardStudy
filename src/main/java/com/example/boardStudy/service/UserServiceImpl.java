package com.example.boardStudy.service;

import com.example.boardStudy.mappers.UserMapper;
import com.example.boardStudy.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public String login(@RequestParam UserVO userVO) throws Exception {
        return userMapper.memberLogin(userVO);
    }
}
