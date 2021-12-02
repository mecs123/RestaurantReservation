package com.boot.bookingresturantapi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "RESERVATION")
public class Reservation implements Serializable {
    private static final long serialVersionUID = 4286362490468702762L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "locator", nullable = false)
    private String locator;
    @Column(name = "turn", nullable = false)
    private String turns;
    @Column(name = "Person", nullable = false)
    private Long Person;
    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESTAURANT_ID", nullable = false)
    private Restaurant restaurant;


}
