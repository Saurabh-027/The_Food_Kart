package com.example.thefoodcart.entity;

import javax.persistence.*;

@Entity
@Table(name = "food_item")
public class FoodItem {

    @Id
    @GeneratedValue
    @Column(name = "food_item_id")
    private Integer foodItemId;

    @ManyToOne
//    @Column(name = "restaurant_id")
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurantId;

//    @Column(name = "item_id")
//    private Integer itemId;

    @Column(name = "foodname")
    private String foodname;

    @Column(name = "price")
    private Integer price;

    public Integer getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(Integer foodItemId) {
        this.foodItemId = foodItemId;
    }

    public Restaurant getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Restaurant restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
