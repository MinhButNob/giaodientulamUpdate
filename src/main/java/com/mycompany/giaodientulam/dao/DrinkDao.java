/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.dao;

import com.mycompany.giaodientulam.entity.Drink;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface DrinkDao extends CrudDao<Drink,String> {
    List <Drink> findByCategoryId(String categoryId);
}
