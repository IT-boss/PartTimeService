package com.ssmlearn.controller;

import com.ssmlearn.service.IWorkInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/WorkInfo")
public class WorkInfoController {

    @Resource
    private IWorkInfoService workInfoService;
}
