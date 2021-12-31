package com.example.The_food_kart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class cart {
    @Id
    @Column(name ="userid")
    int userid;
    @Column(name ="item_name")
    String itemName;
    @Column(name ="quantity")
    int quantity;
    @Column(name ="priceofsingleQuantity")
    int priceofsingleQuantity;
    @Column(name ="totalprice")
    int totalprice;

}
