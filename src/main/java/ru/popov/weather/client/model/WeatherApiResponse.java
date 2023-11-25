package ru.popov.weather.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherApiResponse(
        Coord coord,
        List<Weather> weather,
        String base,
        Main main,
        int visibility,
        Wind wind,
        Clouds clouds,
        long dt,
        Sys sys,
        int timezone,
        int id,
        String name,
        int cod
) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Coord(double lon, double lat) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Weather(int id, String main, String description, String icon) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Main(
            double temp,
            double feels_like,
            double temp_min,
            double temp_max,
            int pressure,
            int humidity
    ) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Wind(double speed, int deg, double gust) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Clouds(int all) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Sys(int type, int id, String country, long sunrise, long sunset) {
    }
}

