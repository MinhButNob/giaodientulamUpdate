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
public interface LoaiDoUongC {
        void setBill(Bill bill);
    void open();
    void fillCategories();
    void fillDrinks();
    void addDrinkToBill();
}
