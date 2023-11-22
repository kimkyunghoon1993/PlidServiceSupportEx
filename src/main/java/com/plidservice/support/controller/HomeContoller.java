package com.plidservice.support.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.plidservice.support.service.UserService;
import com.plidservice.support.vo.UserVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HomeContoller {

    private UserService userService;

    // @GetMapping("/")
    // public String mainPage(UserVo userVo, Model model){
    //     List<UserVo> user = userService.userInfo();
    //     return "home";
    // }

}
