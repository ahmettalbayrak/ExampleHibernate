package com.dao.department;

import com.dao.BaseDao;
import com.pojos.Department;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author AhmetALBAYRAK
 */
public class DepartmentDao extends BaseDao<Department> implements IDepartmentDao{
    
    @Override
    public List<Department> findDepartmentByName(String name) {
        Session ses = HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        Query qu = ses.createQuery("from " + Department.class.getSimpleName() + "WHERE NAME=" + name);
        List<Department> list = qu.list();
        ses.getTransaction().commit();
        ses.close();
        return list;
    }
    
}
