/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.impl;

import com.mycompany.giaodientulam.dao.CategoryDao;
import com.mycompany.giaodientulam.entity.Category;
import com.mycompany.giaodientulam.util.XJdbc;
import com.mycompany.giaodientulam.util.XQuery;
import java.util.List;


/**
 *
 * @author TuanMinh
 */
public class CategoryDaoImpl implements CategoryDao {
    private final String createSql = "INSERT INTO Categories(Id, Name) VALUES(?, ?)";
    private final String updateSql = "UPDATE Categories SET Name=? WHERE Id=?";
    private final String deleteByIdSql = "DELETE FROM Categories WHERE Id=?";
    
    private final String findAllSql = "SELECT * FROM Categories";
    private final String findByIdSql = findAllSql + " WHERE Id=?";

    @Override
    public Category create(Category entity) {
    Object[] values = {
        entity.getId(),
        entity.getName()
    };
    XJdbc.executeUpdate(createSql, values);
    return entity;
}

    @Override
    public void update(Category entity) {
        Object[] values = {
            entity.getName(),
            entity.getId()
        };
        XJdbc.executeUpdate(updateSql, values);
        
    }

    @Override
    public void deleteById(String id) {
            XJdbc.executeUpdate(deleteByIdSql, id);
    }

    @Override
    public List<Category> findAll() {
        return XQuery.getBeanList(Category.class, findAllSql);
    }

    @Override
    public Category findById(String id) {
         return XQuery.getSingleBean(Category.class, findByIdSql, id);
    }
 
}
