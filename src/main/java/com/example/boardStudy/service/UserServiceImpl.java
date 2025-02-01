package com.example.boardStudy.service;

import com.example.boardStudy.repository.admin.UserRepository;
import com.example.boardStudy.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserRepository userRepository; // DAO

    public UserServiceImpl(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
    }

    public void login(UserVO userVO) throws Exception {
        logger.info("Impl 데이터 확인 : " + userVO);
        userRepository.memberLogin(userVO);
    }
}
