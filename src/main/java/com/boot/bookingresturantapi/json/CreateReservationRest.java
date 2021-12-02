package com.boot.bookingresturantapi.json;

import com.boot.bookingresturantapi.entity.Turn;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateReservationRest {

    @JsonProperty("date")
    private Date date;
    @JsonProperty("person")
    private Long Person;
    @JsonProperty("turnId")
    private Long turnId;
    @JsonProperty("restaurantId")
    private Long restaurantId;
}
