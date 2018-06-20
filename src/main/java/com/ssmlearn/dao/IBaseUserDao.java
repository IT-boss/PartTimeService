package com.ssmlearn.dao;

import com.ssmlearn.model.BaseUser;

import java.util.Map;

public interface IBaseUserDao {

    /**
     * id查询
     *
     * @param id
     * @return
     */
    BaseUser selectBaseUserById(long id);

    /**
     * name查询
     *
     * @param name
     * @return
     */
    BaseUser selectBaseUserByName(String name);

    /**
     * 数据插入
     *
     * @param map
     * @return
     */
    boolean insertBaseUser(Map map);

    /**
     * 数据更新
     *
     * @param map
     * @return
     */
    boolean updateBaseUser(Map map);

    /**
     * id删除
     *
     * @param id
     * @return
     */
    boolean deleteBaseUserById(long id);

    /**
     * name删除
     *
     * @param name
     * @return
     */
    boolean deleteBaseUserByName(String name);

}
