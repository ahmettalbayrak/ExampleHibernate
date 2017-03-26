package com.dao;

import java.util.List;

/**
 *
 * @author AhmetALBAYRAK
 */
public interface IBaseDao<T> {

    public List<T> getTable(T entity);
    
    public void save(T entity);
    
    public void delete(T entity, String id);
    
    public void update(T entity, String id);
    

}