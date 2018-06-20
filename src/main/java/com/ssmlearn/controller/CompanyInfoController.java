package com.ssmlearn.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssmlearn.service.ICompanyInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/CompanyInfo")
public class CompanyInfoController {

    @Resource
    private ICompanyInfoService companyInfoService;

    @RequestMapping("/insertCompanyInfo")
    public void insertCompanyInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        Map map = new HashMap();
//        map.put("username", request.getParameter("username"));
//        map.put("password", request.getParameter("password"));
//        map.put("gender", request.getParameter("gender"));
//        map.put("birthday", request.getParameter("birthday"));
//        map.put("email", request.getParameter("email"));
        boolean isin = this.companyInfoService.insertCompanyInfo(map);

        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(isin));
        response.getWriter().close();
    }

}
