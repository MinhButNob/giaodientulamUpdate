/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.ui;
import com.mycompany.giaodientulam.entity.Bill;
/**
 *
 * @author Lenovo
 */
public interface BillC {
    void setBill(Bill bill);
    void open();
    void close();
    void showDrinkJDialog();
    void removeDrinks();
    void updateQuantity();
    void checkout();
    void cancel();
}
