package com.boot.bookingresturantapi.service;

import com.boot.bookingresturantapi.execptions.BookingExepcion;
import com.boot.bookingresturantapi.json.RestaurantRest;

import java.util.List;

public interface RestaurantService {
    RestaurantRest getRestaurantById(Long restaurantId)throws BookingExepcion;

    List<RestaurantRest> getRestaurants() throws BookingExepcion;
}
