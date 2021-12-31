package com.example.The_food_kart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FoodRestaurants {

    @Id
    @Column(name = "restaurant_id")
    int restaurantId;
    @Column(name = "item_id")
    int itemId;
    @Column(name = "foodname")
    String foodname;
    @Column(name = "price")
    int price;
}
