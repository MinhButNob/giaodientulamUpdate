/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.ui.manager;



/**
 *
 * @author TuanMinh
 */

import com.mycompany.giaodientulam.entity.Drink;
import com.mycompany.giaodientulam.entity.Bill;


public interface DrinkController extends CrudController<Drink>{
    void setBill(Bill bill);
    void open();
    void fillCategories();
    void fillDrinks();
    void addDrinkToBill();
}
