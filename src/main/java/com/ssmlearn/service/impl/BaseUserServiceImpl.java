package com.ssmlearn.service.impl;

import com.ssmlearn.dao.IBaseUserDao;
import com.ssmlearn.model.BaseUser;
import com.ssmlearn.service.IBaseUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("baseUserService")
public class BaseUserServiceImpl implements IBaseUserService {

    @Resource
    private IBaseUserDao baseUserDao;

    @Override
    public BaseUser selectBaseUserById(long id) {
        return this.baseUserDao.selectBaseUserById(id);
    }

    @Override
    public BaseUser selectBaseUserByName(String name) {
        return this.baseUserDao.selectBaseUserByName(name);
    }

    @Override
    public boolean insertBaseUser(Map map) {
        return this.baseUserDao.insertBaseUser(map);
    }

    @Override
    public boolean updateBaseUser(Map map) {
        return this.baseUserDao.updateBaseUser(map);
    }

    @Override
    public boolean deleteBaseUserById(long id) {
        return this.baseUserDao.deleteBaseUserById(id);
    }

    @Override
    public boolean deleteBaseUserByName(String name) {
        return this.baseUserDao.deleteBaseUserByName(name);
    }
}
