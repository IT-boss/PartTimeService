package com.ssmlearn.service;

import com.ssmlearn.model.PictureDateBean;

import java.util.Map;

public interface IPictureDateService {
    public PictureDateBean selectPictureDateById(String id);

    public PictureDateBean selectPictureDateByName(String name);

    public boolean insertPictureDate(Map map);

    public boolean updatePictureDate(Map map);

    public boolean deletePictureDateById(String id);

    public boolean deletePictureDateByName(String name);
}
