package com.ssmlearn.dao;

import com.ssmlearn.model.UserInfoBean;

import java.util.Map;

public interface IUserInfoDao {

    UserInfoBean selectUserInfoById(String id);

    UserInfoBean selectUserInfoByName(String name);

    boolean insertUserInfo(Map map);

    boolean updateUserInfo(Map map);

    boolean deleteUserInfoById(String  id);

    boolean deleteUserInfoByName(String name);
}
