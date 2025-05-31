/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.dao;

import com.mycompany.giaodientulam.entity.billDetail;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface billdetailDao extends CrudDao<billDetail, Long> {
      public List<billDetail> findByBillId(Long billId);
      
       public List<billDetail> findByDrinkId(String drinkId);
    
    
}
