package com.ssmlearn.controller;

import com.ssmlearn.dao.IEduExperienceDao;
import com.ssmlearn.service.IEduExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/EduExperience")
public class EduExperienceController {

    @Resource
    private IEduExperienceService eduExperienceService;
}
