package com.javaacademy.wedding_officiant_booking_service.booking_dto;

import lombok.Data;
@Data
public class BookingDto {
    private Integer monthNumber;
    private int dayNumber;
    private boolean booked;

    public BookingDto(Integer monthNumber, int dayNumber) {
        this.monthNumber = monthNumber;
        this.dayNumber = dayNumber;
    }
}
