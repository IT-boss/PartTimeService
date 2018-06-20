package com.ssmlearn.service;

import com.ssmlearn.model.BaseUser;

import java.util.Map;

public interface IBaseUserService {
    /**
     * id查询
     *
     * @param id
     * @return
     */
    public BaseUser selectBaseUserById(long id);

    /**
     * name查询
     *
     * @param name
     * @return
     */
    public BaseUser selectBaseUserByName(String name);

    /**
     * 数据插入
     *
     * @param map
     * @return
     */
    public boolean insertBaseUser(Map map);

    /**
     * 数据更新
     *
     * @param map
     * @return
     */
    public boolean updateBaseUser(Map map);

    /**
     * id删除
     *
     * @param id
     * @return
     */
    public boolean deleteBaseUserById(long id);

    /**
     * name删除
     *
     * @param name
     * @return
     */
    public boolean deleteBaseUserByName(String name);
}
