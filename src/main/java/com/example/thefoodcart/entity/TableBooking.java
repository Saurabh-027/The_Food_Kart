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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TableBookingStatus getTableBookingStatus() {
        return tableBookingStatus;
    }

    public void setTableBookingStatus(TableBookingStatus tableBookingStatus) {
        this.tableBookingStatus = tableBookingStatus;
    }
}
