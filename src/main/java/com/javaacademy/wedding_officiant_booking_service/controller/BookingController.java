package com.javaacademy.wedding_officiant_booking_service.controller;

import com.javaacademy.wedding_officiant_booking_service.booking_dto.BookingCountResponse;
import com.javaacademy.wedding_officiant_booking_service.booking_dto.BookingDto;
import com.javaacademy.wedding_officiant_booking_service.booking_service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/month/{month}/free")
    public BookingCountResponse getCountBookedDays(@PathVariable int month) {
      return   bookingService.countBookedDays(month);
    }

    @GetMapping("/month/{month}")
    public List<BookingDto> getBookingsByMonth(@PathVariable int month) {
        return bookingService.getBookingInfoMonth(month);
    }
    @PostMapping
    public void createBooking(@RequestBody BookingDto bookingDto) {
            bookingService.saveBookings(bookingDto);
    }
}
