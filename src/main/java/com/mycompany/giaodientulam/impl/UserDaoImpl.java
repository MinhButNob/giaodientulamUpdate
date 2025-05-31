/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.impl;

import com.mycompany.giaodientulam.dao.UserDao;
import com.mycompany.giaodientulam.entity.User;
import com.mycompany.giaodientulam.util.XJdbc;
import com.mycompany.giaodientulam.util.XQuery;
import java.util.List;

/**
 *
 * @author TuanMinh
 */
public class UserDaoImpl implements UserDao {

    
private final String createSql = "insert into Users (Username, Password, Enabled, Fullname, Photo, Manager) values (?,?,?,?,?,?)";
private final String updateSql = "update Users set  Password=?, Enabled=?, Fullname=?, Photo=?, Manager=? where Username=?";
private final String deleteSql = "delete from Users where Username=?"; 
private final String findAllSql = "select * from Users";
private final String findByIdSql = "select * from Users where Username=?";
    @Override
    public User create(User entity) {
    Object[] values = {
            entity.getUsername(),
            entity.getPassword(),
            entity.isEnabled(),
            entity.getFullname(),
            entity.getPhoto(),
            entity.isManager()
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(User entity) {
        Object[] values = {
            entity.getPassword(),
            entity.isEnabled(),
            entity.getFullname(),
            entity.getPhoto(),
            entity.isManager(),
            entity.getUsername()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<User> findAll() {
        return XQuery.getBeanList(User.class, findAllSql);
    }

    @Override
    public User findById(String id) {
        return XQuery.getSingleBean(User.class, findByIdSql, id);
    }
    
}
