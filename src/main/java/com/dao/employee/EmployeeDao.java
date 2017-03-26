/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.employee;

import com.dao.BaseDao;
import com.pojos.Employee;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author AhmetALBAYRAK
 */
public class EmployeeDao extends BaseDao implements IEmployeeDao{

    @Override
    public List<Employee> findEmployee(int salary) {
        Session ses = HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        Query qu = ses.createQuery("from " + Employee.class.getSimpleName() + "WHERE SALARY=" + salary);
        List<Employee> list = qu.list();
        ses.getTransaction().commit();
        ses.close();
        return list;
    }

    
    
}
