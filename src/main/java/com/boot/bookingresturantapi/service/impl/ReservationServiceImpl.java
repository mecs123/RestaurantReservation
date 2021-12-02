package com.boot.bookingresturantapi.service.impl;

import com.boot.bookingresturantapi.entity.Reservation;
import com.boot.bookingresturantapi.entity.Restaurant;
import com.boot.bookingresturantapi.entity.Turn;
import com.boot.bookingresturantapi.execptions.BookingExepcion;
import com.boot.bookingresturantapi.execptions.dtos.NotFoundExepcion;
import com.boot.bookingresturantapi.json.CreateReservationRest;
import com.boot.bookingresturantapi.json.ReservationRest;
import com.boot.bookingresturantapi.repository.ReservationRepository;
import com.boot.bookingresturantapi.repository.RestaurantRepository;
import com.boot.bookingresturantapi.repository.TurnRepository;
import com.boot.bookingresturantapi.service.ReservationService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ReservationServiceImpl implements ReservationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReservationServiceImpl.class);
    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    RestaurantRepository restaurantRepository;
    @Autowired
    TurnRepository turnRepository;
    public static final ModelMapper modelMapper = new ModelMapper();


    public String createReservation(CreateReservationRest createReservationRest) throws BookingExepcion {
        final Restaurant restaurantId = restaurantRepository.findById(createReservationRest.getRestaurantId()).orElseThrow(()-> new NotFoundExepcion("RESTAURANT_NOT_FOUND", "401"));
        final Turn turnName = turnRepository.findById(createReservationRest.getTurnId()).orElseThrow(()-> new NotFoundExepcion("TURN_NOT_FOUND", "401"));

        String locator = generateLocator(restaurantId,createReservationRest);
        final Reservation reservation = new Reservation();
        reservation.setLocator(locator);
        reservation.setPerson(createReservationRest.getPerson());
        reservation.setDate(createReservationRest.getDate());
        reservation.setRestaurant(restaurantId);
        reservation.setTurns(turnName.getName());
        try {
            reservationRepository.save(reservation);
        }catch (final Exception e){
            LOGGER.error("INTERNAL_SERVER_ERROR");
            throw new InternalError("INTERNAL_SERVER_ERROR");
        }
        return locator;
    }

    @Override
    public ReservationRest getReservation(Long reservationId) throws BookingExepcion {
        return null;
    }

    private String generateLocator(Restaurant restaurantId, CreateReservationRest createReservationRest) throws BookingExepcion{
            return restaurantId.getName() + createReservationRest.getRestaurantId();
    }


}
