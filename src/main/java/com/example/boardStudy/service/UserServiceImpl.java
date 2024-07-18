package com.example.boardStudy.service;

import com.example.boardStudy.mappers.UserMapper;
import com.example.boardStudy.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserVO userVO;

    @Autowired
    UserMapper userMapper;
    

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
