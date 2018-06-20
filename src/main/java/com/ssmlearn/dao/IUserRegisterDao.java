package com.ssmlearn.dao;

import com.ssmlearn.model.UserRegisterBean;

import java.util.Map;

public interface IUserRegisterDao {

    UserRegisterBean selectUserRegisterById(String id);

    UserRegisterBean selectUserRegisterByName(String name);

    boolean insertUserRegister(Map map);

    boolean updateUserRegister(Map map);

    boolean deleteUserRegisterById(String  id);

    boolean deleteUserRegisterByName(String name);
}
