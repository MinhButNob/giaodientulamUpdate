/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.dao;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface CrudDao <T, ID> {
    T create(T entity);
    void update(T entity);
    void deleteById(ID id);
    T findById(ID id);
    List<T> findAll();

    
   
}
