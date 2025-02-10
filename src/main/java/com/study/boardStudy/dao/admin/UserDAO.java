package com.study.boardStudy.dao.admin;

import com.study.boardStudy.dto.LoginDTO;
import com.study.boardStudy.dto.SignupDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * DAO 또는 JPA 레파지토리
 */
@Mapper
public interface UserDAO {

    int join(SignupDTO signupDTO);

    LoginDTO memberLogin(LoginDTO loginDTO);
}
