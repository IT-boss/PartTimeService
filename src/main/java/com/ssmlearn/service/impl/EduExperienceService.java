package com.ssmlearn.service.impl;

import com.ssmlearn.dao.IEduExperienceDao;
import com.ssmlearn.model.EduExperienceBean;
import com.ssmlearn.service.IEduExperienceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("eduExperienceService")
public class EduExperienceService implements IEduExperienceService {

    @Resource
    private IEduExperienceDao eduExperienceDao;

    @Override
    public EduExperienceBean selectEduExperienceById(String id) {
        return this.eduExperienceDao.selectEduExperienceById(id);
    }

    @Override
    public EduExperienceBean selectEduExperienceByName(String name) {
        return this.eduExperienceDao.selectEduExperienceByName(name);
    }

    @Override
    public boolean insertEduExperience(Map map) {
        return this.eduExperienceDao.insertEduExperience(map);
    }

    @Override
    public boolean updateEduExperience(Map map) {
        return this.eduExperienceDao.updateEduExperience(map);
    }

    @Override
    public boolean deleteEduExperienceById(String id) {
        return this.eduExperienceDao.deleteEduExperienceById(id);
    }

    @Override
    public boolean deleteEduExperienceByName(String name) {
        return this.eduExperienceDao.deleteEduExperienceByName(name);
    }
}
