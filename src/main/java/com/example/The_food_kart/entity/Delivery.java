package com.example.The_food_kart.entity;

import org.hibernate.annotations.Cache;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Delivery {
    @Id
    @Column(name = "user_id")
    int userId;
    @Column(name = "order_id")
    int orderId;
    @Column(name = "address")
    String address;
}
