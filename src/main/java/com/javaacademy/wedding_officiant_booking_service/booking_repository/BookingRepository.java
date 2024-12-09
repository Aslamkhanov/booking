package com.javaacademy.wedding_officiant_booking_service.booking_repository;

import com.javaacademy.wedding_officiant_booking_service.entity_booking.Booking;
import com.javaacademy.wedding_officiant_booking_service.storage.StorageBookingInformation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@RequiredArgsConstructor
public class BookingRepository {
    private final StorageBookingInformation storageBookingInformation;

    public int countBookedDays(int month) {
      return storageBookingInformation.getData().getOrDefault(month, new ArrayList<>()).size();
    }
    public List<Booking> getBookingInfoMonth(int month) {
        return storageBookingInformation.getData().getOrDefault(month, new ArrayList<>());
    }
    public void saveBooking(Booking booking) {
        storageBookingInformation.getData().put(booking.getMonth(),new ArrayList<>());
        List<Booking> bookings = storageBookingInformation.getData().get(booking.getMonth());

        boolean dayExists = bookings.stream().anyMatch(b -> b.getDay() == booking.getDay());

        if (!dayExists) {
            bookings.add(booking);
        } else {
            throw new RuntimeException("Этот день уже забронирован");
        }
    }
}
