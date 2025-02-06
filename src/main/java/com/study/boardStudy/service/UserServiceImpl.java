package com.study.boardStudy.service;

import com.study.boardStudy.dao.admin.SignupDAO;
import com.study.boardStudy.vo.SignupVO;
import com.study.boardStudy.vo.LoginVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final SignupDAO signupDAO; // DAO

    @Autowired
    public UserServiceImpl(SignupDAO signupDAO) {
        this.signupDAO = signupDAO;
    }

    @Override
    public boolean join(SignupVO signupVO) {
        int result = signupDAO.join(signupVO);
        return result > 0;
    }

    public void login(LoginVO loginVO) throws Exception {
        logger.info("Impl 데이터 확인 : " + loginVO);
        signupDAO.memberLogin(loginVO);
    }
}
