package com.ssmlearn.service;

import com.ssmlearn.model.UserRegisterBean;

import java.util.Map;

public interface IUserRegisterService {


    public UserRegisterBean selectUserRegisterById(String id);

    public UserRegisterBean selectUserRegisterByName(String name);

    public boolean insertUserRegister(Map map);

    public boolean updateUserRegister(Map map);

    public boolean deleteUserRegisterById(String id);

    public boolean deleteUserRegisterByName(String name);
}
