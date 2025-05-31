/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.dao;

import com.mycompany.giaodientulam.entity.Revenue;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Lenovo
 */
public interface RevenueDao {
    List<Revenue.ByCategory> getByCategory(Date begin, Date end);

    List<Revenue.ByUser> getByUser(Date begin, Date end);
}
