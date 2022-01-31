package com.example.thefoodcart.entity;

import com.example.thefoodcart.flag.TableBookingStatus;

import javax.persistence.*;

@Entity
@Table(name = "table_booking")
public class TableBooking {
    @Id
    @GeneratedValue
    @Column(name = "booking_id")
    private Integer bookingId;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "status")
    private TableBookingStatus tableBookingStatus;

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Integer getUser() {
        return userId;
    }

    public void setUser(Integer userId) {
        this.userId = userId;
    }

    public TableBookingStatus getTableBookingStatus() {
        return tableBookingStatus;
    }

    public void setTableBookingStatus(TableBookingStatus tableBookingStatus) {
        this.tableBookingStatus = tableBookingStatus;
    }
}
