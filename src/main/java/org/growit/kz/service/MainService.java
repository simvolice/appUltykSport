package org.growit.kz.service;


import org.growit.kz.model.*;

import java.util.List;

/**
 * Created by user on 19.11.2014.
 */
public interface MainService {





    public ArticleEntity findByIdArticleEntity(int id);

public void addRecordsArticle(ArticleEntity articleEntity);

    public void addRecordsImage(ImageEntity imageEntity);

    public String deleteRecordImage(ImageEntity imageEntity);





    // User dao

    public List<UsersEntity> getAllRecordsUserEntity();

    public void addRecordsUsers(UsersEntity usersEntity);

    public void deleteRecordUsers(UsersEntity usersEntity);

    public UsersEntity findByIdUser(int id);

    public String updateRecordsUsers(UsersEntity usersEntity);






}
