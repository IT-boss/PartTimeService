package com.ssmlearn.service.impl;

import com.ssmlearn.dao.IWorkExperienceDao;
import com.ssmlearn.model.WorkExperienceBean;
import com.ssmlearn.service.IWorkExperienceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("workExperienceService")
public class WorkExperienceService implements IWorkExperienceService {

    @Resource
    private IWorkExperienceDao workExperienceDao;

    @Override
    public WorkExperienceBean selectWorkExperienceById(String id) {
        return this.workExperienceDao.selectWorkExperienceById(id);
    }

    @Override
    public WorkExperienceBean selectWorkExperienceByName(String name) {
        return this.workExperienceDao.selectWorkExperienceByName(name);
    }

    @Override
    public boolean insertWorkExperience(Map map) {
        return this.workExperienceDao.insertWorkExperience(map);
    }

    @Override
    public boolean updateWorkExperience(Map map) {
        return this.workExperienceDao.updateWorkExperience(map);
    }

    @Override
    public boolean deleteWorkExperienceById(String id) {
        return this.workExperienceDao.deleteWorkExperienceById(id);
    }

    @Override
    public boolean deleteWorkExperienceByName(String name) {
        return this.workExperienceDao.deleteWorkExperienceByName(name);
    }
}
