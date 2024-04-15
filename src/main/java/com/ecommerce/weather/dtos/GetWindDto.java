package com.ecommerce.weather.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GetWindDto {
    private double speed;
    private int deg;
    private double gust;


}
