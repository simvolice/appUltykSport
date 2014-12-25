package org.growit.kz.dao;

import org.growit.kz.model.UsersEntity;

import java.util.List;

/**
 * Created by Администратор on 10.11.2014.
 */

public interface UserDAO {

    public List<UsersEntity> getAllRecordsUserEntity();

    public void addRecordsUsers(UsersEntity usersEntity);

    public void deleteRecordUsers(UsersEntity usersEntity);

    public UsersEntity findByIdUser(int id);

    public String updateRecordsUsers(UsersEntity usersEntity);



}
