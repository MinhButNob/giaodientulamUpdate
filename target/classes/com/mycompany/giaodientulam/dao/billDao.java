/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.dao;

import com.mycompany.giaodientulam.entity.Bill;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface billDao extends CrudDao<Bill, Long> {
     public List<Bill> findByUsername(String username);
     
     public List<Bill> findByCardId(Integer cardId);
     
     public Bill findServicingByCardId(Integer cardId);
     
     public List<Bill> findByTimeRange(Date from, Date to);
     
     public List<Bill> findByUserAndTimeRange(String username, Date from, Date to);
     
}
