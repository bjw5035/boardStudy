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
    public boolean login(String userId, String userPw) {

        try {

            LoginVO loginUser = userDAO.memberLogin(new LoginVO(userId, userPw));
            logger.info("result : " + loginUser);

            if (loginUser == null) {
                logger.error("login user is null");
                return false; // 사용자 없음
            }

            // null 체크 및 ID, PW 검증
            if (!loginUser.getUserId().equals(userId) || !loginUser.getUserPw().equals(userPw)){
                return false; // 로그인 실패
            }

            return true; // 로그인 성공
        }catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }

    }

}
