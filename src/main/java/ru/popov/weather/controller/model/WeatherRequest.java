package ru.popov.weather.controller.model;

import org.springframework.beans.factory.annotation.Value;

public record WeatherRequest(
        Double longitude,
        Double latitude) {}
