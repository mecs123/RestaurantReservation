package com.boot.bookingresturantapi.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationRest {

    @JsonProperty("locator")
    private String locator;
    @JsonProperty("restaurantId")
    private Long restaurantId;
    @JsonProperty("date")
    private Date date;
    @JsonProperty("person")
    private Long Person;
    @JsonProperty("turnId")
    private Date turnId;

}
