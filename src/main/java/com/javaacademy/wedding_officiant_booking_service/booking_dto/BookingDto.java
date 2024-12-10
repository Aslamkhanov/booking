package com.javaacademy.wedding_officiant_booking_service.booking_dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class BookingDto {
    @JsonProperty("month")
    private Integer monthNumber;
    @JsonProperty("day")
    private int dayNumber;
    private boolean booked;

    public BookingDto(Integer monthNumber, int dayNumber) {
        this.monthNumber = monthNumber;
        this.dayNumber = dayNumber;
    }
}
