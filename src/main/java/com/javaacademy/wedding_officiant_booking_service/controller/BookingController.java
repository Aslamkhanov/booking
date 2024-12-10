package com.javaacademy.wedding_officiant_booking_service.controller;

import com.javaacademy.wedding_officiant_booking_service.booking_dto.BookingCountResponse;
import com.javaacademy.wedding_officiant_booking_service.booking_dto.BookingDto;
import com.javaacademy.wedding_officiant_booking_service.booking_service.BookingService;
import com.javaacademy.wedding_officiant_booking_service.entity_booking.Booking;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/booking/month/{month}/free")
    public BookingCountResponse getCountBookedDays(@PathVariable int month) {
        return bookingService.countBookedDays(month);
    }

    @GetMapping("/booking/month/{month}")
    public List<BookingDto> getBookingsByMonth(@PathVariable int month) {
        return bookingService.getBookingInfoMonth(month);
    }

    @PostMapping("/booking")
    public void createBooking(@RequestBody BookingDto bookingDto) {
        bookingService.saveBookings(bookingDto);
    }
}
