/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.ui.manager;

import com.mycompany.giaodientulam.entity.Bill;

/**
 *
 * @author TuanMinh
 */
public interface BillManagerController extends CrudController<Bill>{ 
    void fillBillDetails();
    void selectTimeRange();
}
