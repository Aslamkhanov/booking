package com.javaacademy.wedding_officiant_booking_service.entity_booking;

import lombok.*;

import java.util.Date;

@Data
public class Booking {
    private Integer month;
    private int day;
    private boolean booked;

    public Booking(Integer month, int day) {
        this.month = month;
        this.day = day;
    }
}
