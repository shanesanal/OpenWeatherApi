package com.ecommerce.weather.services;

import com.ecommerce.weather.dtos.GetWeatherResponseDto;
import com.ecommerce.weather.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${openWeather.url-cityTemp}")
    private String BaseURLCityTemp;
    @Value("${openWeather.token}")
    private String token;

    public GetWeatherResponseDto getWeatherByCity(String city) throws NotFoundException {
        RestTemplate restTemplate = new RestTemplate();
        String url = BaseURLCityTemp + "?q=" + city + "&appid=" + token;

        GetWeatherResponseDto weather = restTemplate.getForObject(url, GetWeatherResponseDto.class);
        if(weather ==null)
        {
            throw new NotFoundException();

        }
        return weather;


    }
}
