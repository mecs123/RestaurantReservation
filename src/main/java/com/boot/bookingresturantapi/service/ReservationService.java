package com.boot.bookingresturantapi.service;

import com.boot.bookingresturantapi.execptions.BookingExepcion;
import com.boot.bookingresturantapi.json.CreateReservationRest;
import com.boot.bookingresturantapi.json.ReservationRest;

public interface ReservationService {
    ReservationRest getReservation(Long reservationId)throws BookingExepcion;
    String createReservation(CreateReservationRest createReservationRest)throws BookingExepcion;

}
