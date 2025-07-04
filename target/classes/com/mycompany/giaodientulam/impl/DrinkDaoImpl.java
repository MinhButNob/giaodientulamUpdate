/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.impl;

import com.mycompany.giaodientulam.dao.DrinkDao;
import com.mycompany.giaodientulam.entity.Drink;
import com.mycompany.giaodientulam.util.XJdbc;
import com.mycompany.giaodientulam.util.XQuery;
import java.util.List;

/**
 *
 * @author TuanMinh
 */
public class DrinkDaoImpl implements DrinkDao {

      private final String createSql = "INSERT INTO Drinks VALUES (?,?,?,?,?,?,?)";
    private final String updateSql = "UPDATE Drinks SET Name = ?, UnitPrice = ?, Discount = ?, Image = ?, Available = ?, CategoryId = ? WHERE Id = ?";
    private final String deleteSql = "DELETE FROM Drinks WHERE Id=?";
    private final String findAllSql = "SELECT * FROM Drinks";
    private final String findByIdSql = "SELECT * FROM Drinks WHERE Id=?";
    private final String findByCategoryIdSql = "SELECT * FROM Drinks WHERE CategoryId=?";

    @Override
    public List<Drink> findByCategoryId(String categoryId) {
        return XQuery.getBeanList(Drink.class, findByCategoryIdSql, categoryId);
    }

    @Override
    public Drink create(Drink entity) {
        Object[] values = {
            entity.getId(),
            entity.getName(),
            entity.getUnitPrice(),
            entity.getDiscount(),
            entity.getImage(),
            entity.isAvailable(),
            entity.getCategoryId()
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(Drink entity) {
        Object[] values = {
            entity.getName(),
            entity.getUnitPrice(),
            entity.getDiscount(),
            entity.getImage(),
            entity.isAvailable(),
            entity.getCategoryId(),
            entity.getId()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<Drink> findAll() {
        return XQuery.getBeanList(Drink.class, findAllSql);
    }

    @Override
    public Drink findById(String id) {
        return XQuery.getSingleBean(Drink.class, findByIdSql, id);
    }
}
