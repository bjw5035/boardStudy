package com.study.boardStudy.service;

import com.study.boardStudy.dao.admin.UserDAO;
import com.study.boardStudy.vo.SignupVO;
import com.study.boardStudy.vo.LoginVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean join(SignupVO signupVO) {
        int result = userDAO.join(signupVO);
        return result > 0;
    }

    @Override
    public String login(LoginVO loginVO) {
        String result = userDAO.memberLogin(loginVO);
        logger.info(result);

        try {
            if (result != null && !result.isEmpty()) {
                return result;
            }
        }catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }


}
