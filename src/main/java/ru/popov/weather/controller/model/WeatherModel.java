package ru.popov.weather.controller.model;

import java.time.LocalDateTime;

public record WeatherModel(LocalDateTime dateTime, Double temperature, TemperatureType temperatureType) {

}
