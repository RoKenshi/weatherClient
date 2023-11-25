package ru.popov.weather.service;

import org.springframework.stereotype.Component;

@Component
public class TempCounterService {

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
