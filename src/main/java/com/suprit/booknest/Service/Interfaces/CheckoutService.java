package com.suprit.booknest.Service.Interfaces;


import com.suprit.booknest.Entities.BookingEntity;

public interface CheckoutService {

    String getCheckoutSession(BookingEntity booking, String successUrl, String failureUrl);

}
