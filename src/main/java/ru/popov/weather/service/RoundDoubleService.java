package ru.popov.weather.service;

import org.springframework.stereotype.Component;

@Component
public class RoundDoubleService {

    public double roundToTwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;

    }
}
