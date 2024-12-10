package com.javaacademy.wedding_officiant_booking_service.booking_service;

import com.javaacademy.wedding_officiant_booking_service.booking_dto.BookingCountResponse;
import com.javaacademy.wedding_officiant_booking_service.booking_dto.BookingDto;
import com.javaacademy.wedding_officiant_booking_service.booking_mapper.BookingMapper;
import com.javaacademy.wedding_officiant_booking_service.booking_repository.BookingRepository;
import com.javaacademy.wedding_officiant_booking_service.entity_booking.Booking;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    public BookingCountResponse countBookedDays(int month) {
        int count = bookingRepository.countBookedDays(month);
        return new BookingCountResponse(count);
    }
    public List<BookingDto> getBookingInfoMonth(int month) {
        return bookingRepository.getBookingMonth(month).stream()
                .map(bookingMapper::convertDto).collect(Collectors.toList());
    }
    public void saveBookings(BookingDto bookingDto) {
        Booking booking = bookingMapper.convertToEntity(bookingDto);
        bookingRepository.saveBooking(booking);
    }
}
