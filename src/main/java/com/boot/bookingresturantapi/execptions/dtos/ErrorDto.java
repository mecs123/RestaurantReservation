package com.boot.bookingresturantapi.execptions.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class ErrorDto  implements Serializable {

    private static final long serialVersionUID = 1389061241245395906L;
    private String name;
    private String value;
}
