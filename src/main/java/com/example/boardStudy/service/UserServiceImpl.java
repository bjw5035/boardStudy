package com.example.boardStudy.service;

import com.example.boardStudy.dao.admin.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public void login(String userId, String userPw) throws Exception {

        userDao.memberLogin(userId, userPw);

    }
}
