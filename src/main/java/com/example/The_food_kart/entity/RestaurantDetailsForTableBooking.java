package com.example.The_food_kart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RestaurantDetailsForTableBooking {
    @Id
    @Column(name = "restaurant_id")
    int restaurantId;
    @Column(name = "restaurant_name")
    String restaurantName;
    @Column(name = "totalChair_available")
    String totalChairAvailable;
    @Column(name = "address")
    String address;
}
