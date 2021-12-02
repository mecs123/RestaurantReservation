package com.boot.bookingresturantapi.service.impl;

import com.boot.bookingresturantapi.entity.Restaurant;
import com.boot.bookingresturantapi.execptions.BookingExepcion;
import com.boot.bookingresturantapi.execptions.dtos.NotFoundExepcion;
import com.boot.bookingresturantapi.json.RestaurantRest;
import com.boot.bookingresturantapi.repository.RestaurantRepository;
import com.boot.bookingresturantapi.service.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class RestaurantServiceImpl implements RestaurantService {


    @Autowired
    RestaurantRepository restaurantRepository;
    public static final ModelMapper modelMapper = new ModelMapper();

    public RestaurantRest getRestaurantById(Long restaurantId) throws BookingExepcion {
        return modelMapper.map(getRestaurantById(restaurantId),RestaurantRest.class);
    }

    public List<RestaurantRest> getRestaurants() throws BookingExepcion {
        final List<Restaurant> restaurantEntity = restaurantRepository.findAll();
        return restaurantEntity.stream().map(service -> modelMapper.map(service, RestaurantRest.class)).collect(Collectors.toList());
    }

    private Restaurant gerRestaurantEntity(Long restaurantId) throws BookingExepcion{
        return restaurantRepository.findByIdRestaurant(restaurantId).orElseThrow(()-> new NotFoundExepcion("SNOT-404-1","RESTAURANT_NOT_FOUN"));
    }
}
