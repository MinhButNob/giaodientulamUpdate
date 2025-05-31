/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.util;

import com.mycompany.giaodientulam.entity.User;

/**
 *
 * @author Lenovo
 */
public class XAuth {
    public static User user;

    static {
        user = new User();
        user.setUsername("user1@gmail.com");
        user.setPassword("123");
        user.setEnabled(true);
        user.setManager(true);
        user.setFullname("Nguyễn Văn Tèo");
        user.setPhoto("trump.png");
    }
}
