package com.javaacademy.wedding_officiant_booking_service.storage;

import com.javaacademy.wedding_officiant_booking_service.entity_booking.Booking;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Data
public class StorageBookingInformation {
    private Map<Integer, List<Booking>> data = new HashMap<>();
    public List<Booking> getMonth(int month) {
        return data.getOrDefault(month, new ArrayList<>());
    }
}
