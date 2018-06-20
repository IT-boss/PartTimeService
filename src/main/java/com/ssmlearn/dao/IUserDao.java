package com.ssmlearn.dao;

import com.ssmlearn.model.User;

import java.util.Map;

public interface IUserDao {

    User selectUser(long id);

    boolean deleteUser(String name);

    boolean insertUser(Map map);

}
