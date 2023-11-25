package ru.popov.weather.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.popov.weather.client.model.WeatherApiResponse;
import ru.popov.weather.controller.facade.WeatherFacade;
import ru.popov.weather.controller.model.WeatherRequest;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherFacade weatherFacade;

    @PostMapping
    public WeatherApiResponse getWeather(@RequestBody final WeatherRequest request){
        return weatherFacade.getWeather(request);
    }


}
