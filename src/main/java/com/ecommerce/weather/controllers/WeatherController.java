package com.ecommerce.weather.controllers;

import com.ecommerce.weather.dtos.GetWeatherResponseDto;
import com.ecommerce.weather.services.WeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

        private final WeatherService weatherService;
        public WeatherController(WeatherService weatherService) {
            this.weatherService = weatherService;
        }


    @GetMapping("/city/{city}")
    public @ResponseBody GetWeatherResponseDto getWeatherByCity(@PathVariable String city) throws Exception {
        return weatherService.getWeatherByCity(city);
    }

}
