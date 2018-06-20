package com.ssmlearn.service.impl;

import com.ssmlearn.dao.ICompanyInfoDao;
import com.ssmlearn.model.CompanyInfoBean;
import com.ssmlearn.service.ICompanyInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("companyInfoService")
public class CompanyInfoService implements ICompanyInfoService {

    @Resource
    private ICompanyInfoDao companyInfoDao;

    @Override
    public CompanyInfoBean selectCompanyInfoById(String id) {
        return this.companyInfoDao.selectCompanyInfoById(id);
    }

    @Override
    public CompanyInfoBean selectCompanyInfoByName(String name) {
        return this.companyInfoDao.selectCompanyInfoByName(name);
    }

    @Override
    public boolean insertCompanyInfo(Map map) {
        return this.companyInfoDao.insertCompanyInfo(map);
    }

    @Override
    public boolean updateCompanyInfo(Map map) {
        return this.companyInfoDao.updateCompanyInfo(map);
    }

    @Override
    public boolean deleteCompanyInfoById(String id) {
        return this.companyInfoDao.deleteCompanyInfoById(id);
    }

    @Override
    public boolean deleteCompanyInfoByName(String name) {
        return this.companyInfoDao.deleteCompanyInfoByName(name);
    }
}
