package ru.popov.weather.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.popov.weather.client.model.WeatherApiResponse;

@FeignClient(name = "weather")
public interface ExternalWeatherApi {


    @GetMapping
    WeatherApiResponse getWeather(
            @RequestParam(name = "lon") double longitude,
            @RequestParam(name = "lat") double latitude,
            @RequestParam(name = "appid") String appid );
}
