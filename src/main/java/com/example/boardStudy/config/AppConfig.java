package com.example.boardStudy.config;

import com.example.boardStudy.dao.admin.UserDao;
import com.example.boardStudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    // 추가 설정이 필요하면 여기에 추가

    @Bean
    public UserDao userDao() {
        return new UserDao() {
            @Override
            public String memberLogin(String userId, String userPw) throws Exception {
                return null;
            }
        };
    }
}

