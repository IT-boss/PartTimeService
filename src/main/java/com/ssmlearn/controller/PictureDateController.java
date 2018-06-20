package com.ssmlearn.controller;

import com.ssmlearn.service.IPictureDateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/PictureDate")
public class PictureDateController {

    @Resource
    private IPictureDateService pictureDateService;

}
