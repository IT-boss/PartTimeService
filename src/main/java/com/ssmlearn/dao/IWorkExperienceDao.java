package com.ssmlearn.dao;

import com.ssmlearn.model.WorkExperienceBean;

import java.util.Map;

public interface IWorkExperienceDao {


    WorkExperienceBean selectWorkExperienceById(String id);

    WorkExperienceBean selectWorkExperienceByName(String name);

    boolean insertWorkExperience(Map map);

    boolean updateWorkExperience(Map map);

    boolean deleteWorkExperienceById(String  id);

    boolean deleteWorkExperienceByName(String name);
}
