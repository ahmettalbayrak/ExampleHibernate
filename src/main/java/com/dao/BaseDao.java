/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;


import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author AhmetALBAYRAK
 */
public class BaseDao<T> implements IBaseDao<T>{
    private T entity;
    
    @Override
    public void update(T entity,String id) {
        Session ses = HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        ses.update(id, ses);
        ses.getTransaction().commit();
        ses.close();
    }
    
    @Override
    public void delete(T entity, String id) {        
        Session ses = HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        ses.delete(id, ses);
        ses.delete(entity);
        ses.getTransaction().commit();
        ses.close();
    }
    
    @Override
    public List<T> getTable(T entity){      
        Session ses = HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        Query qu = ses.createQuery("from " + entity.getClass().getSimpleName());
        List<T> list = (List<T>) qu.list();
        ses.getTransaction().commit();
        ses.close();
        return list;
    }

    @Override
    public void save(T entity) {
        Session ses = HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        ses.save(entity);
        ses.getTransaction().commit();
        ses.close();
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    

    

    
    
    
}
