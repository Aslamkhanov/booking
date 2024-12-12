package com.javaacademy.wedding_officiant_booking_service.storage;

import com.javaacademy.wedding_officiant_booking_service.entity_booking.Booking;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Data
public class StorageBookingInformation {
    private Map<Integer, List<Booking>> data = new HashMap<>();
}
