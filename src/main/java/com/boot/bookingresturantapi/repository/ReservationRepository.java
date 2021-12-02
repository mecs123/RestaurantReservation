package com.boot.bookingresturantapi.repository;

import com.boot.bookingresturantapi.entity.Reservation;
import com.boot.bookingresturantapi.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    Optional<Reservation> findById(Long id);
    Optional<Reservation> findByLocator(String locator);
    @Modifying
    @Transactional
    Optional<Reservation> deleteByLocator(String locators);
    Optional<Reservation> findByTurnAndRestaurantId(String turn, Long restaurantId);




}
