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
public class User {
    private String username;
    private String password;
    private boolean enabled;
    private String fullname;
    private String photo;
    private boolean manager;
    

    // Constructor đầy đủ tham số
    public User(String username, String password, boolean enabled, String fullname, String photo, boolean manager) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.fullname = fullname;
        this.photo = photo;
        this.manager = manager;
    }

    // Constructor mặc định
    public User() {
        this.enabled = true; // Mặc định tài khoản hoạt động
        this.photo = "photo.png"; // Ảnh mặc định
        this.manager = false; // Mặc định là nhân viên
    }
    

    // Getter và Setter
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

    public String getFullname() { return fullname; }
    public void setFullname(String fullname) { this.fullname = fullname; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

    public boolean isManager() { return manager; }
    public void setManager(boolean manager) { this.manager = manager; }
}