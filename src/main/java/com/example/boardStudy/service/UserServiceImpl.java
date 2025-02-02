package com.example.boardStudy.service;

import com.example.boardStudy.dao.admin.UserDAO;
import com.example.boardStudy.vo.JoinVO;
import com.example.boardStudy.vo.LoginVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDAO userDAO; // DAO

    @Override
    public JoinVO join(JoinVO joinVO) {
        return userDAO.join(joinVO);
    }

    public void login(LoginVO loginVO) throws Exception {
        logger.info("Impl 데이터 확인 : " + loginVO);
        userDAO.memberLogin(loginVO);
    }
}
