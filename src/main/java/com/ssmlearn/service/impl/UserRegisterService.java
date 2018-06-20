package com.ssmlearn.service.impl;

import com.ssmlearn.dao.IUserRegisterDao;
import com.ssmlearn.model.UserRegisterBean;
import com.ssmlearn.service.IUserRegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("userRegisterService")
public class UserRegisterService implements IUserRegisterService{

    @Resource
    private IUserRegisterDao userRegisterDao;

    @Override
    public UserRegisterBean selectUserRegisterById(String id) {
        return this.userRegisterDao.selectUserRegisterById(id);
    }

    @Override
    public UserRegisterBean selectUserRegisterByName(String name) {
        return this.userRegisterDao.selectUserRegisterByName(name);
    }

    @Override
    public boolean insertUserRegister(Map map) {
        return this.userRegisterDao.insertUserRegister(map);
    }

    @Override
    public boolean updateUserRegister(Map map) {
        return this.userRegisterDao.updateUserRegister(map);
    }

    @Override
    public boolean deleteUserRegisterById(String id) {
        return this.userRegisterDao.deleteUserRegisterById(id);
    }

    @Override
    public boolean deleteUserRegisterByName(String name) {
        return this.userRegisterDao.deleteUserRegisterByName(name);
    }
}
