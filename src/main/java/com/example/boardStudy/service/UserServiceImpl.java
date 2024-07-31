package com.example.boardStudy.service;

import com.example.boardStudy.dao.admin.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    public void login(String userId, String userPw) throws Exception {

        try {
            if (userId.length() > 0) {
                userDao.memberLogin(userId, userPw);
                logger.info("success");
            }
        } catch (Exception e) {
            logger.error("login fail");

        }


    }
}
