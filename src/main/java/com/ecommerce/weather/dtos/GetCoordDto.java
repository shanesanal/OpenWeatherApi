package com.ecommerce.weather.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GetCoordDto {
    private Double lat;
    private Double lon;
}
