package ru.popov.weather.controller.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.popov.weather.client.ExternalWeatherApi;
import ru.popov.weather.client.model.WeatherApiResponse;
import ru.popov.weather.controller.model.WeatherRequest;


@Service
@RequiredArgsConstructor
public class WeatherFacade {

    @Value("${weather.token}")
    private String token;

    private final ExternalWeatherApi externalWeatherApi;

    public WeatherApiResponse getWeather(WeatherRequest request) {
        return externalWeatherApi.getWeather(request.longitude(), request.latitude(), token);
    }
}
