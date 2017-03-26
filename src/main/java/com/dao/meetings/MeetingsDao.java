/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.meetings;

import com.dao.BaseDao;
import com.pojos.Meetings;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author AhmetALBAYRAK
 */
public class MeetingsDao extends BaseDao implements IMeetingsDao{

    @Override
    public List<Meetings> findDepartmentByName(String description) {
        Session ses = HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        Query qu = ses.createQuery("from " + Meetings.class.getSimpleName() + "WHERE DESCRIPTION=" + description);
        List<Meetings> list = qu.list();
        ses.getTransaction().commit();
        ses.close();
        return list;
    }
    
    
}
