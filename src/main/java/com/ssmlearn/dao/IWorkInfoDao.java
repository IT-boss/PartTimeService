package com.ssmlearn.dao;

import com.ssmlearn.model.WorkInfoBean;

import java.util.Map;

public interface IWorkInfoDao {

    WorkInfoBean selectWorkInfoById(String id);

    WorkInfoBean selectWorkInfoByName(String name);

    boolean insertWorkInfo(Map map);

    boolean updateWorkInfo(Map map);

    boolean deleteWorkInfoById(String  id);

    boolean deleteWorkInfoByName(String name);
}
