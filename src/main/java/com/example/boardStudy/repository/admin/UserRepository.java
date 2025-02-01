package com.example.boardStudy.repository.admin;

import com.example.boardStudy.vo.UserVO;
import org.springframework.stereotype.Repository;

/**
 * DAO 또는 JPA 레파지토리
 */
@Repository
public interface UserRepository {

    void memberLogin(UserVO userVO);
}
