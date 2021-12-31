package com.example.The_food_kart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin {
    @Id
    @Column(name = "id")
    int id;
    @Column(name = "order_id")
    int orderId;
    @Column(name = "orderQuantity")
    int orderQuantity;
    @Column(name = "availableAmount")
    int availableAmount;
    @Column(name = "status")
    String status;
}
