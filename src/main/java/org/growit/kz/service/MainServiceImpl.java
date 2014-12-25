package org.growit.kz.service;

import org.growit.kz.dao.ArticleDAO;
import org.growit.kz.dao.ImageDao;
import org.growit.kz.dao.UserDAO;
import org.growit.kz.model.ArticleEntity;
import org.growit.kz.model.ImageEntity;
import org.growit.kz.model.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Естай on 18.11.2014.
 */
@Service
public class MainServiceImpl implements MainService {


    private UserDAO userDAO;

    private ImageDao imageDao;
    private ArticleDAO articleDAO;


    @Autowired
    public MainServiceImpl(
            UserDAO userDAO, ImageDao imageDao, ArticleDAO articleDAO) {

        this.userDAO = userDAO;

        this.imageDao = imageDao;
        this.articleDAO = articleDAO;
    }


    @Override
    @Transactional
    public ArticleEntity findByIdArticleEntity(int id) {


        return articleDAO.findByIdArticle(id);


    }

    @Override
    @Transactional
    public void addRecordsArticle(ArticleEntity articleEntity) {

        articleDAO.addRecordsArticle(articleEntity);


    }

    @Override
    @Transactional
    public void addRecordsImage(ImageEntity imageEntity) {
        imageDao.addRecordsImage(imageEntity);
    }

    @Override
    @Transactional
    public String deleteRecordImage(ImageEntity imageEntity) {
        return null;
    }


    @Override
    @Transactional
    public List<UsersEntity> getAllRecordsUserEntity() {
        return userDAO.getAllRecordsUserEntity();
    }

    @Override
    @Transactional
    public void addRecordsUsers(UsersEntity usersEntity) {
        userDAO.addRecordsUsers(usersEntity);
    }

    @Override
    @Transactional
    public void deleteRecordUsers(UsersEntity usersEntity) {
        userDAO.deleteRecordUsers(usersEntity);
    }

    @Override
    @Transactional
    public UsersEntity findByIdUser(int id) {
        return userDAO.findByIdUser(id);
    }

    @Override
    @Transactional
    public String updateRecordsUsers(UsersEntity usersEntity) {
        return userDAO.updateRecordsUsers(usersEntity);
    }

}