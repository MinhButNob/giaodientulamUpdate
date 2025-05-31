/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.entity;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

/**
 *
 * @author Lenovo
 */
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder    
//@Data
public class billDetail{
    private Long id;
    private Long billid;
    private String drinkId;
    private double unitPrice;
    private double discount;
    private int quantity;
    private String drinkName;

    public billDetail() {
    }

    public billDetail(Long id, Long billid, String drinkId, double unitPrice, double discount, int quantity, String drinkName) {
        this.id = id;
        this.billid = billid;
        this.drinkId = drinkId;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.quantity = quantity;
        this.drinkName = drinkName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBillid() {
        return billid;
    }

    public void setBillid(Long billid) {
        this.billid = billid;
    }

    public String getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(String drinkId) {
        this.drinkId = drinkId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

}
