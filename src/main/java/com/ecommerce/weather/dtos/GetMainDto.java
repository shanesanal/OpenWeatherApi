package com.ecommerce.weather.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GetMainDto {
    private double temp;
    private double humidity;
    private int pressure;
    private double temp_min;
    private double temp_max;
}
