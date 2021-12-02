package com.boot.bookingresturantapi.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TurnRest {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
}
