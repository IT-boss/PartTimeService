package com.ssmlearn.service.impl;

import com.ssmlearn.dao.IWorkInfoDao;
import com.ssmlearn.model.WorkInfoBean;
import com.ssmlearn.service.IWorkInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("workInfoService")
public class WorkInfoService implements IWorkInfoService {

    @Resource
    private IWorkInfoDao workInfoDao;

    @Override
    public WorkInfoBean selectWorkInfoById(String id) {
        return this.workInfoDao.selectWorkInfoById(id);
    }

    @Override
    public WorkInfoBean selectWorkInfoByName(String name) {
        return this.workInfoDao.selectWorkInfoByName(name);
    }

    @Override
    public boolean insertWorkInfo(Map map) {
        return this.workInfoDao.insertWorkInfo(map);
    }

    @Override
    public boolean updateWorkInfo(Map map) {
        return this.workInfoDao.updateWorkInfo(map);
    }

    @Override
    public boolean deleteWorkInfoById(String id) {
        return this.workInfoDao.deleteWorkInfoById(id);
    }

    @Override
    public boolean deleteWorkInfoByName(String name) {
        return this.workInfoDao.deleteWorkInfoByName(name);
    }
}
