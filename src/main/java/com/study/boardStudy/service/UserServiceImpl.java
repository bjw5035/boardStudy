package com.study.boardStudy.service;

import com.study.boardStudy.dao.admin.UserDAO;
import com.study.boardStudy.vo.SignupVO;
import com.study.boardStudy.vo.LoginVO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public String login(String userId, String userPw) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("userId", userId);
            map.put("userPw", userPw);
            validateLogin(map);
            //TODO 2025-02-07 쿼리에서 ID 비교 방법 필요
            //TODO 2025-02-07 로그인 ID 비교 후 redirect 고려
            String result = userDAO.memberLogin(userId, userPw);
            logger.info("result : " + result);
        }catch (Exception e) {
            return e.getMessage();
        }
        return null;
    }

    @Override
    public Map<String, Object> validateLogin(Map<String, Object> map) {


        return null;

    }


}
