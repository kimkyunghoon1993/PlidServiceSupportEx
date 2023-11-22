package com.plidservice.support.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.plidservice.support.vo.UserVo;

@Mapper
public interface UserMapper {
    List<UserVo> getUserList();
}
