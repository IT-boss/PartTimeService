package com.ssmlearn.service;

import com.ssmlearn.model.UserInfoBean;

import java.util.Map;

public interface IUserInfoService {

    public UserInfoBean selectUserInfoById(String id);

    public UserInfoBean selectUserInfoByName(String name);

    public boolean insertUserInfo(Map map);

    public boolean updateUserInfo(Map map);

    public boolean deleteUserInfoById(String id);

    public boolean deleteUserInfoByName(String name);
}
