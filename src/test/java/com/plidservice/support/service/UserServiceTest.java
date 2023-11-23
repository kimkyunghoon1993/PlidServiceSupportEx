package com.plidservice.support.service;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.plidservice.support.vo.UserVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
@RequiredArgsConstructor
public class UserServiceTest {

    private UserService userService;

    @Test
    public void getUserList(){
        List<UserVo> userList = userService.getUserList();
        log.info("userList : {}" , userList);
    }
}
