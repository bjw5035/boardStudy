package com.example.boardStudy.dao.admin;

import com.example.boardStudy.vo.JoinVO;
import com.example.boardStudy.vo.LoginVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * DAO 또는 JPA 레파지토리
 */
@Mapper
public interface UserDAO {

    JoinVO join(JoinVO joinVO);
    void memberLogin(LoginVO loginVO);
}
