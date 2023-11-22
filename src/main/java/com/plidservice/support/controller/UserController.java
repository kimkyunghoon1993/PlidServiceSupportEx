package com.plidservice.support.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.plidservice.support.service.UserService;
import com.plidservice.support.vo.UserVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private UserService userService;

    public String mainpage(UserVo userVo, Model model){
        List<UserVo> user = userService.MemberService(userVo);

        model.addAttribute("ID","ID");
        model

        return "home";
    }

}
