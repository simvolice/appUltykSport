package org.growit.kz.dao;

import org.growit.kz.model.ImageEntity;

import java.util.List;

/**
 * Created by user on 22.12.2014.
 */
public interface ImageDao {

    public List<ImageEntity> getAllRecordsImage();

    public void addRecordsImage(ImageEntity imageEntity);

    public String deleteRecordImage(ImageEntity imageEntity);

    public ImageEntity findByIdImage(int id);

    public String updateRecordsImage(ImageEntity imageEntity);


}
