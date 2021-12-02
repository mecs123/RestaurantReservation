package com.boot.bookingresturantapi.execptions;

import com.boot.bookingresturantapi.execptions.dtos.ErrorDto;
import java.util.ArrayList;
import java.util.List;

public class BookingExepcion extends Exception{
    private String code;
    private int responseCode;
    private final List<ErrorDto> errorList = new ArrayList<>();


    public BookingExepcion(String message, String code, int responseCode, List<ErrorDto> errorList) {
        super(message);
        this.code = code;
        this.responseCode = responseCode;
        this.errorList.addAll(errorList);

    }

    public BookingExepcion(String message, String code) {

    }


    public BookingExepcion(String message, int value, String code) {

    }

    public BookingExepcion(String message, String code, int value, int responseCode, List<ErrorDto> errorList) {

    }
}
