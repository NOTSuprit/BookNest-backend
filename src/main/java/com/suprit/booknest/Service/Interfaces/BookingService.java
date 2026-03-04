package com.suprit.booknest.Service.Interfaces;

import com.suprit.booknest.Dto.BookingDTO;
import com.suprit.booknest.Dto.BookingRequest;
import com.suprit.booknest.Dto.GuestDTO;
import com.suprit.booknest.Dto.HotelReportDTO;
import com.suprit.booknest.Enums.BookingStatus;
import com.stripe.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {
    BookingDTO initialiseBooking(BookingRequest bookingRequest);

    BookingDTO addGuests(Long bookingId, List<GuestDTO> guestDtoList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingStatus getBookingStatus(Long bookingId);

    List<BookingDTO> getAllBookingsByHotelId(Long hotelId);

    HotelReportDTO getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDTO> getMyBookings();
}
