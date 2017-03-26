/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.meetings;

import com.pojos.Meetings;
import java.util.List;

/**
 *
 * @author AhmetALBAYRAK
 */
public interface IMeetingsDao {
    
    public List<Meetings> findDepartmentByName(String description);
}
