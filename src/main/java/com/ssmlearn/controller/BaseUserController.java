package com.ssmlearn.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssmlearn.model.BaseUser;
import com.ssmlearn.service.IBaseUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/baseUser")
public class BaseUserController  {

    @Resource
    private IBaseUserService baseUserService;

    @RequestMapping("/showBaseUser.id")
    public void selectBaseUserById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        BaseUser user = this.baseUserService.selectBaseUserById(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }

    @RequestMapping("/showBaseUser.name")
    public void selectBaseUserByName(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("name");
        BaseUser user = this.baseUserService.selectBaseUserByName(userName);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }

    @RequestMapping("/deleteUserByName")
    public void deleteBaseUserByName(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String param = request.getParameter("name");
        boolean isdel = this.baseUserService.deleteBaseUserByName(param);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(isdel));
        response.getWriter().close();
    }

    @RequestMapping("/insertUser")
    public void insertUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Map map = new HashMap();
        map.put("username", request.getParameter("username"));
        map.put("password", request.getParameter("password"));
        map.put("gender", request.getParameter("gender"));
        map.put("borthday", request.getParameter("borthday"));
        map.put("email", request.getParameter("email"));

        boolean isin = this.baseUserService.insertBaseUser(map);

        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(isin));
        response.getWriter().close();
    }

}
