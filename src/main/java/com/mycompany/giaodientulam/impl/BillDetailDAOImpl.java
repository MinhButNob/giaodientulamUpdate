/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.impl;

import com.mycompany.giaodientulam.dao.billdetailDao;
import com.mycompany.giaodientulam.entity.billDetail;
import com.mycompany.giaodientulam.util.XJdbc;
import com.mycompany.giaodientulam.util.XQuery;
import java.util.List;

/**
 *
 * @author TuanMinh
 */
public class BillDetailDAOImpl implements billdetailDao {

     private final String createSql = "INSERT INTO BillDetails(BillId, DrinkId, UnitPrice, Discount, Quantity) VALUES(?, ?, ?, ?, ?)";
    private final String updateSql = "UPDATE BillDetails SET BillId=?, DrinkId=?, UnitPrice=?, Discount=?, Quantity=? WHERE Id=?";
    private final String deleteByIdSql = "DELETE FROM BillDetails WHERE Id=?";

    private final String findAllSql = "SELECT bd.*, d.name AS drinkName FROM BillDetails bd JOIN Drinks d ON d.Id=bd.DrinkId";
    private final String findByIdSql = findAllSql + " WHERE bd.Id=?";
    private final String findLastSql = findAllSql + " WHERE bd.Id IN(SELECT max(Id) FROM BillDetails)";
    private final String findByBillIdSql = findAllSql + " WHERE bd.BillId=?";
    private final String findByDrinkIdSql = findAllSql + " WHERE bd.DrinkId=?";
    
    @Override
    public List<billDetail> findByBillId(Long billId) {
        return XQuery.getBeanList(billDetail.class, findByBillIdSql, billId);
    }


    @Override
    public List<billDetail> findByDrinkId(String drinkId) {
        return XQuery.getBeanList(billDetail.class, findByDrinkIdSql, drinkId);
    }

    @Override
    public billDetail create(billDetail entity) {
        Object[] values = {
            entity.getBillid(),
            entity.getDrinkId(),
            entity.getUnitPrice(),
            entity.getDiscount(),
            entity.getQuantity()
        };
        XJdbc.executeUpdate(createSql, values);
        return XQuery.getSingleBean(billDetail.class, findLastSql);
    }

    @Override
    public void update(billDetail entity) {
        Object[] values = {
            entity.getBillid(),
            entity.getDrinkId(),
            entity.getUnitPrice(),
            entity.getDiscount(),
            entity.getQuantity(),
            entity.getId()
        };
        XJdbc.executeUpdate(updateSql, values);
    }
    @Override
    public void deleteById(Long id) {
        XJdbc.executeUpdate(deleteByIdSql, id);
    }

    @Override
    public billDetail findById(Long id) {
        return XQuery.getSingleBean(billDetail.class,findByIdSql, id);
    }

    @Override
    public List<billDetail> findAll() {
        return XQuery.getBeanList(billDetail.class,findAllSql);
    }
    
}
