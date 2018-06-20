package com.ssmlearn.service.impl;

import com.ssmlearn.dao.IPictureDateDao;
import com.ssmlearn.model.PictureDateBean;
import com.ssmlearn.service.IPictureDateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("pictureDateService")
public class PictureDateService implements IPictureDateService {

    @Resource
    private IPictureDateDao pictureDateDao;

    @Override
    public PictureDateBean selectPictureDateById(String id) {
        return this.pictureDateDao.selectPictureDateById(id);
    }

    @Override
    public PictureDateBean selectPictureDateByName(String name) {
        return this.pictureDateDao.selectPictureDateByName(name);
    }

    @Override
    public boolean insertPictureDate(Map map) {
        return this.pictureDateDao.insertPictureDate(map);
    }

    @Override
    public boolean updatePictureDate(Map map) {
        return this.pictureDateDao.updatePictureDate(map);
    }

    @Override
    public boolean deletePictureDateById(String id) {
        return this.pictureDateDao.deletePictureDateById(id);
    }

    @Override
    public boolean deletePictureDateByName(String name) {
        return this.pictureDateDao.deletePictureDateByName(name);
    }
}
