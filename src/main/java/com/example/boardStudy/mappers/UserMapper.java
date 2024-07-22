package com.example.boardStudy.mappers;

import com.example.boardStudy.vo.UserVO;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface UserMapper {

    String memberLogin(@RequestParam UserVO userVO) throws Exception;

}
