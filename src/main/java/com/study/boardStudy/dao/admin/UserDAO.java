package com.study.boardStudy.dao.admin;

import com.study.boardStudy.dto.LoginDTO;
import com.study.boardStudy.dto.SignupDTO;
import com.study.boardStudy.vo.LoginVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * DAO 또는 JPA 레파지토리
 */
@Mapper
public interface UserDAO {

    int join(SignupDTO signupDTO);

    LoginVO memberLogin(LoginDTO loginDTO);
}
