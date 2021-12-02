package com.boot.bookingresturantapi.repository;

import com.boot.bookingresturantapi.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    Optional<Restaurant> findByIdRestaurant(Long id);
    Optional<Restaurant> findByName(String nameRestaurant);
    @Query("SELECT REST FROM restaurant REST")
    public List<Restaurant> findRestaurants();

}
