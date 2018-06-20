package com.ssmlearn.controller;

import com.ssmlearn.service.IWorkExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/WorkExperience")
public class WorkExperienceController {

    @Resource
    private IWorkExperienceService workExperienceService;
}
