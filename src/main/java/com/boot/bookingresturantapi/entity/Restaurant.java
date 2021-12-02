package com.boot.bookingresturantapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "RESTAURANT")
public class Restaurant implements Serializable {

    private static final long serialVersionUID = -5814320505293426968L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, unique = true)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private String image;

    //Hacer reservacion-- > El restaurante tiene muchas reservas
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant")
    private List<Reservation> reservations;
    //Hacer reservacion-- > El restaurante tiene muchas Mesas
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant")
    private List<Board> boards;
    //Hacer reservacion-- > El restaurante tiene muchos Turnos
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant")
    private List<Turn> turns;



}
