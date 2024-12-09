package com.javaacademy.wedding_officiant_booking_service.entity_booking;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    private Integer month;
    private int day;
    private boolean booked;
}
