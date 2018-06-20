package com.ssmlearn.controller;

import com.ssmlearn.service.IUserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/UserInfo")
public class UserInfoController {

    @Resource
    private IUserInfoService userInfoService;

}
