package com.example.boardStudy.mappers;

import com.example.boardStudy.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface UserMapper {

    String memberLogin(@RequestParam UserVO userVO) throws Exception;

}
