package com.example.boardStudy.mappers;

import org.springframework.stereotype.Repository;

@Repository(value = "web")
public interface UserMapper {

    String memberLogin(String userId);

}
