package com.example.boardStudy.config;

import com.example.boardStudy.repository.admin.BoardRepository;
import com.example.boardStudy.repository.admin.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    // 추가 설정이 필요하면 여기에 추가

    @Bean
    public UserRepository userDao() {
        return new UserRepository() {
            @Override
            public void memberLogin(String userId, String userPw) throws Exception {
            }
        };
    }

    @Bean
    public BoardRepository boardDao() {
        return new BoardRepository() {
            @Override
            public void boardInsert(int id, String title, String content, String author) {
            }
        };
    }

}

