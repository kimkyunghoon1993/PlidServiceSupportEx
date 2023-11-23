package com.plidservice.support;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class PildServiceBackOfficeSupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(PildServiceBackOfficeSupportApplication.class, args);
    }

    @Bean
    CommandLineRunner init(){
        return (String[] args) -> {
            log.info("필드서비스 서포터 서버 실행 완료!");
        };
    }
}
