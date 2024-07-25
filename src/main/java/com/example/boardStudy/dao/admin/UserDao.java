package com.example.boardStudy.dao.admin;

import org.springframework.stereotype.Repository;

/*
* 다른 방법으로 사용생각중
* */
@Repository
public interface UserDao {

    String memberLogin(String userId, String userPw) throws Exception;

}
