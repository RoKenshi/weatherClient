package ru.popov.weather.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.popov.weather.controller.facade.WeatherFacade;
import ru.popov.weather.controller.model.TemperatureType;
import ru.popov.weather.controller.model.WeatherRequest;
import ru.popov.weather.service.input.UserInput;

@Component
@RequiredArgsConstructor
public class MainLogicService {

    @Value("${weather.geo.kudrovo.latitude}")
    private Double latitude;

    @Value("${weather.geo.kudrovo.longitude}")
    private Double longitude;


    private final WeatherFacade weatherFacade;
    private final UserInput userInput;
    public void run() {

        WeatherRequest weatherRequest = new WeatherRequest(longitude, latitude);
        RoundDoubleService roundDoubleService = new RoundDoubleService();
        double weatherTemp = weatherFacade.getWeather(weatherRequest).main().temp();
        double celsiusTemp = new TempCounterService().kelvinToCelsius(weatherTemp);
        double celsiusTempRound = roundDoubleService.roundToTwoDecimalPlaces(celsiusTemp);

        String temperatureMessage = String.valueOf(
                new StringBuilder()
                        .append("Температура за окном ")
                        .append(celsiusTempRound)
                        .append(" ")
                        .append(TemperatureType.C)
        );

        userInput.showToUser(temperatureMessage);

    }
}
