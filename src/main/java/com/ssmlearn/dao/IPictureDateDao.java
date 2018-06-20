package com.ssmlearn.dao;

import com.ssmlearn.model.PictureDateBean;

import java.util.Map;

public interface IPictureDateDao {


    PictureDateBean selectPictureDateById(String id);

    PictureDateBean selectPictureDateByName(String name);

    boolean insertPictureDate(Map map);

    boolean updatePictureDate(Map map);

    boolean deletePictureDateById(String  id);

    boolean deletePictureDateByName(String name);
}
