/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodientulam.entity;

import java.util.Date;
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

public class Bill {
    private Long id;
    private String username;
    private Integer cardId;
    private Date checkin;
    private Date checkout;
    private int status;

    // Constructor mặc định
    public Bill() {
        
        this.checkin = new Date(); // Mặc định check-in là thời điểm tạo Bill
        this.status = 0; // Mặc định trạng thái
    }

    // Constructor đầy đủ
    public Bill(Long id, String username, Integer cardId, Date checkin, Date checkout, int status) {
        this.id = id;
        this.username = username;
        this.cardId = cardId;
        this.checkin = checkin;
        this.checkout = checkout;
        this.status = status;
    }
    
    public enum Status {
        Servicing, Completed, Canceled;
    }
    public static final String DATE_PATTERN = "HH:mm:ss dd-MM-yyyy";

    // Getter và Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}