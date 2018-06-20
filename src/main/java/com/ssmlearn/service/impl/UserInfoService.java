package com.ssmlearn.service.impl;

import com.ssmlearn.dao.IUserInfoDao;
import com.ssmlearn.model.UserInfoBean;
import com.ssmlearn.service.IUserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("userInfoService")
public class UserInfoService implements IUserInfoService {

    @Resource
    private IUserInfoDao userInfoDao;

    @Override
    public UserInfoBean selectUserInfoById(String id) {
        return this.userInfoDao.selectUserInfoById(id);
    }

    @Override
    public UserInfoBean selectUserInfoByName(String name) {
        return this.userInfoDao.selectUserInfoByName(name);
    }

    @Override
    public boolean insertUserInfo(Map map) {
        return this.userInfoDao.insertUserInfo(map);
    }

    @Override
    public boolean updateUserInfo(Map map) {
        return this.userInfoDao.updateUserInfo(map);
    }

    @Override
    public boolean deleteUserInfoById(String id) {
        return this.userInfoDao.deleteUserInfoById(id);
    }

    @Override
    public boolean deleteUserInfoByName(String name) {
        return this.userInfoDao.deleteUserInfoByName(name);
    }
}
