package com.example.boardStudy.repository.admin;

import org.springframework.stereotype.Repository;

/*
* 다른 방법으로 사용생각중
* */
@Repository
public interface UserRepository {

    void memberLogin(String userId, String userPw) throws Exception;

}
