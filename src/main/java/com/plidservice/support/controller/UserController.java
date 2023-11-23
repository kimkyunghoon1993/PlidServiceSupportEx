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
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public String mainPage(){

        return "index";
    }

    @GetMapping("/userList")
    public String userList(Model model){

        log.info("회원목록 요청");

        List<UserVo> userList = userService.getUserList();

        model.addAttribute("userList",userList);
        return "user/home";
    }

}
