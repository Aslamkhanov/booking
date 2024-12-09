package com.javaacademy.wedding_officiant_booking_service.booking_mapper;

import com.javaacademy.wedding_officiant_booking_service.booking_dto.BookingDto;
import com.javaacademy.wedding_officiant_booking_service.entity_booking.Booking;
import org.springframework.stereotype.Service;

@Service
public class BookingMapper {
    public BookingDto convertDto(Booking booking) {
        return new BookingDto(booking.getMonth(), booking.getDay());
    }
    public Booking convertToEntity(BookingDto bookingDto) {
        return new Booking(bookingDto.getMonthNumber(), bookingDto.getDayNumber(), true);
    }
}
