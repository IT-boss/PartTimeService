package com.ssmlearn.service;

import com.ssmlearn.model.User;

public interface IUserService {
    public User selectUser(long userId);

    public boolean deleteUser(String name);

    public boolean insertUser(String... params);
}
