package com.example.boardStudy.service;

import com.example.boardStudy.mappers.UserMapper;
import com.example.boardStudy.vo.UserVO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserVO userVO;
    private final UserMapper userMapper;

    public UserServiceImpl(UserVO userVO, UserMapper userMapper) {
        this.userVO = userVO;
        this.userMapper = userMapper;
    }

    public String login(UserVO userVO) throws Exception {

        String result = userMapper.memberLogin(userVO);

        return result;
    }
}
