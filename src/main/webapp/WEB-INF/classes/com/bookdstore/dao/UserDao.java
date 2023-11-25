package com.bookdstore.dao;

import com.bookdstore.entity.Users;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDao extends JpaDao<Users> implements GenericDao<Users> {

    public UserDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Users create(Users users){
        return super.create(users);
    }

    @Override
    public Users update(Users users) {
        return super.update(users);
    }

    @Override
    public Users get(Object id) {
        return null;
    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public List<Users> listAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
