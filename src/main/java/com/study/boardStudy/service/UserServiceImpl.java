package com.study.boardStudy.service;

import com.study.boardStudy.dao.admin.UserDAO;
import com.study.boardStudy.dto.LoginDTO;
import com.study.boardStudy.dto.SignupDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDAO userDAO;

    @Override
    public boolean join(SignupDTO signupDTO) {

        String joinId = signupDTO.getJoinId();
        String joinPw = signupDTO.getJoinPw();

        if (joinId == null || joinId.isEmpty() || joinPw == null || joinPw.isEmpty()) {
            logger.error("join id or joinPw is empty");
            return false;
        }

        int result = userDAO.join(signupDTO);
        return result > 0;
    }

    @Override
    public boolean login(String userId, String userPw) {

        try {

            // userId, userPw가 빈값이면 false
            if (userId.isEmpty() || userPw.isEmpty()) {
                throw new IllegalStateException("userId, userPw is empty");
            }
            LoginDTO loginUser = userDAO.memberLogin(new LoginDTO(userId, userPw));
            logger.info("result : " + loginUser);

            if (loginUser == null) {
                logger.error("login user is null");
                return false; // 사용자 없음
            }

            // null 체크 및 ID, PW 검증
            if (!loginUser.getUserId().equals(userId) || !loginUser.getUserPw().equals(userPw)) {
                return false; // 로그인 실패
            }

            return true; // 로그인 성공
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }

    }

}
