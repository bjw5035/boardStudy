package com.example.boardStudy.mappers;

import com.example.boardStudy.vo.UserVO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    String memberLogin(UserVO userVO) throws Exception;

}
