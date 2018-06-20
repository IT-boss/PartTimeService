package com.ssmlearn.controller;

import com.ssmlearn.service.IUserRegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/UserRegister")
public class UserRegisterController {

    @Resource
    private IUserRegisterService userRegisterService;

}
