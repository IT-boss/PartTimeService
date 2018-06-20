package com.ssmlearn.service;

import com.ssmlearn.model.EduExperienceBean;

import java.util.Map;

public interface IEduExperienceService {


    public EduExperienceBean selectEduExperienceById(String id);

    public EduExperienceBean selectEduExperienceByName(String name);

    public boolean insertEduExperience(Map map);

    public boolean updateEduExperience(Map map);

    public boolean deleteEduExperienceById(String id);

    public boolean deleteEduExperienceByName(String name);
}
