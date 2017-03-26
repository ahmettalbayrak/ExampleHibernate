/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.department;

import com.pojos.Department;
import java.util.List;

/**
 *
 * @author AhmetALBAYRAK
 */
public interface IDepartmentDao {
    /**
     * name parametresine göre departmanları listeler
     * @param name
     * @return 
     */
    public List<Department> findDepartmentByName(String name);
    

    
}
