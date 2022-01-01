package com.example.thefoodcart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FoodItem {

    @Id
    @Column(name = "restaurant_id")
    private Integer restaurantId;

    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "foodname")
    private String foodname;

    @Column(name = "price")
    private Integer price;
}
