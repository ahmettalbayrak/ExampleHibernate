/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examplehibernate;

import com.dao.BaseDao;
import com.dao.department.DepartmentDao;
import com.dao.employee.EmployeeDao;
import com.pojos.Department;
import com.pojos.Employee;
import com.util.HibernateUtil;
import java.util.List;

/**
 *
 * @author AhmetALBAYRAK
 */
public class App {
    public static void main(String[] args) {
        
        DepartmentDao depDao = new DepartmentDao();        
        Department dep = new Department();
        dep.setName("It");
        dep.setDescription("Software");
        depDao.save(dep);
        
        
        List<Department> table = depDao.getTable(dep);
        for(Department list : table) {
            System.out.println(list.getName() + " " + list.getDescription());
        }
        HibernateUtil.shutdown();
    }
    
}
