/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.dao;

import com.mycompany.giaodientulam.entity.Category;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface CategoryDao extends CrudDao<Category, String> {
    List<Category> findAll();
}
