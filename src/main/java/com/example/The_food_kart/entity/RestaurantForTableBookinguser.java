package com.example.The_food_kart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RestaurantForTableBookinguser {
    @Id
    @Column(name = "restaurants_id")
    int restaurantsId;
    @Column(name = "user_id")
    int userId;
    @Column(name = "name")
    String name;
    @Column(name = "address")
    String address;
    @Column(name = "TotalChairNeeded")
    int totalChairNeeded;
}
