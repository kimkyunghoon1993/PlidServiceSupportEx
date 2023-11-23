package com.plidservice.support.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.plidservice.support.mapper.UserMapper;
import com.plidservice.support.vo.UserVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserMapper userMapper;

    public List<UserVo> getUserList(){
        return userMapper.getUserList();
    }

}
