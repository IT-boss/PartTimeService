package com.ssmlearn.dao;

import com.ssmlearn.model.CompanyInfoBean;

import java.util.Map;

public interface ICompanyInfoDao {

    CompanyInfoBean selectCompanyInfoById(String id);

    CompanyInfoBean selectCompanyInfoByName(String name);

    boolean insertCompanyInfo(Map map);

    boolean updateCompanyInfo(Map map);

    boolean deleteCompanyInfoById(String  id);

    boolean deleteCompanyInfoByName(String name);
}
