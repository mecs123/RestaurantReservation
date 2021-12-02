package com.boot.bookingresturantapi.execptions.dtos;

import com.boot.bookingresturantapi.execptions.BookingExepcion;
import org.springframework.http.HttpStatus;

import java.util.List;


public class NotFoundExepcion extends BookingExepcion {


    private static final long serialVersionUID = -5842918424470544620L;

    public NotFoundExepcion(String message, String code) {
        super(message, HttpStatus.NOT_FOUND.value(), code);
    }

    public NotFoundExepcion(String message, String code, int responseCode, List<ErrorDto> errorList) {
        super(message, code,HttpStatus.NOT_FOUND.value(), responseCode, errorList);
    }
}
