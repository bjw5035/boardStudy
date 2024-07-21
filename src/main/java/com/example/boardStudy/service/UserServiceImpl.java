package com.example.boardStudy.service;

import com.example.boardStudy.mappers.UserMapper;
import com.example.boardStudy.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {


    private final UserVO userVO;
    private final UserMapper userMapper;

    public UserServiceImpl(UserVO userVO, UserMapper userMapper) {
        this.userVO = userVO;
        this.userMapper = userMapper;
    }

    public String login(UserVO userVO) throws Exception{

        String result = userMapper.memberLogin(userVO);

//        if (userId.equals(result)) {
//            log.info("계정이 일치합니다.");
//        } else {
//            log.error("계정이 일치하지 않습니다.");
//        }

        return result;
    }

}
