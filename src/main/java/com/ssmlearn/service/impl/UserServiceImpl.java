package com.ssmlearn.service.impl;


import com.ssmlearn.dao.IUserDao;
import com.ssmlearn.model.User;
import com.ssmlearn.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

    public boolean deleteUser(String name) {
        return this.userDao.deleteUser(name);
    }

    public boolean insertUser(String... params){
        Map map = new HashMap();
        map.put("userId",params[0]);
        map.put("username",params[1]);

        return this.userDao.insertUser(map);
    }


}
