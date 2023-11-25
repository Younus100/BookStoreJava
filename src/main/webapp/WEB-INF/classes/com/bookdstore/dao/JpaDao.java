package com.bookdstore.dao;

import javax.persistence.EntityManager;

public class JpaDao<T> {
    protected EntityManager entityManager;

    public JpaDao(EntityManager entityManager) {
        super();
        this.entityManager = entityManager;
    }

    public T create(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.flush();
        entityManager.refresh(entity);
        entityManager.getTransaction().commit();
        return entity;
    }

    public T update(T entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        return entity;
    }
}
