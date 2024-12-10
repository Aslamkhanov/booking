package com.javaacademy.wedding_officiant_booking_service.booking_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingCountResponse {
    private long count;
}
