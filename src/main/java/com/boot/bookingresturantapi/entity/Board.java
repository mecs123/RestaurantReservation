package com.boot.bookingresturantapi.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "BOARD")
@Entity
public class Board implements Serializable {

    private static final long serialVersionUID = -3084662062742370340L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "capacity", nullable = false)
    private Long capacity;
    @Column(name = "number", nullable = false)
    private Long number;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "RESTAURANT_ID", nullable = false)
    private Restaurant restaurant;


}
