package com.example.The_food_kart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserRegistration {
    @Id
    @Column(name = "user_id")
    int userId;
    @Column(name = "name")
    String name;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;

}
