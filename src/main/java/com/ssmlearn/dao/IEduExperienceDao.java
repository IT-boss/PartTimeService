package com.ssmlearn.dao;

import com.ssmlearn.model.EduExperienceBean;

import java.util.Map;

public interface IEduExperienceDao {

    EduExperienceBean selectEduExperienceById(String id);

    EduExperienceBean selectEduExperienceByName(String name);

    boolean insertEduExperience(Map map);

    boolean updateEduExperience(Map map);

    boolean deleteEduExperienceById(String  id);

    boolean deleteEduExperienceByName(String name);
}
