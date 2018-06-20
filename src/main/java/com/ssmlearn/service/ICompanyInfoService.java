package com.ssmlearn.service;

import com.ssmlearn.model.CompanyInfoBean;

import java.util.Map;

public interface ICompanyInfoService {

    public CompanyInfoBean selectCompanyInfoById(String id);

    public CompanyInfoBean selectCompanyInfoByName(String name);

    public boolean insertCompanyInfo(Map map);

    public boolean updateCompanyInfo(Map map);

    public boolean deleteCompanyInfoById(String id);

    public boolean deleteCompanyInfoByName(String name);
}
