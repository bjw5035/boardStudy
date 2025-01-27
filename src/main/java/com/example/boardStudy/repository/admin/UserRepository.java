package com.example.boardStudy.repository.admin;

import org.springframework.stereotype.Repository;

/**
 * DAO 또는 JPA 레파지토리
 */
@Repository
public interface UserRepository {

    void memberLogin(String userId, String userPw) throws Exception;

}
