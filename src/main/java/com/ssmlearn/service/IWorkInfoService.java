package com.ssmlearn.service;

import com.ssmlearn.model.WorkInfoBean;

import java.util.Map;

public interface IWorkInfoService {
    public WorkInfoBean selectWorkInfoById(String id);

    public WorkInfoBean selectWorkInfoByName(String name);

    public boolean insertWorkInfo(Map map);

    public boolean updateWorkInfo(Map map);

    public boolean deleteWorkInfoById(String id);

    public boolean deleteWorkInfoByName(String name);
}
