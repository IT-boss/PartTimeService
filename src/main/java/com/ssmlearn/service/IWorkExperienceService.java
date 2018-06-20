package com.ssmlearn.service;

import com.ssmlearn.model.WorkExperienceBean;

import java.util.Map;

public interface IWorkExperienceService {
    public WorkExperienceBean selectWorkExperienceById(String id);

    public WorkExperienceBean selectWorkExperienceByName(String name);

    public boolean insertWorkExperience(Map map);

    public boolean updateWorkExperience(Map map);

    public boolean deleteWorkExperienceById(String id);

    public boolean deleteWorkExperienceByName(String name);
}
