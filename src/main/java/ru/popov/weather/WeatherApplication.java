package ru.popov.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import ru.popov.weather.client.ExternalWeatherApi;
import ru.popov.weather.client.model.WeatherApiResponse;
import ru.popov.weather.controller.facade.WeatherFacade;
import ru.popov.weather.controller.model.WeatherRequest;
import ru.popov.weather.service.MainLogicService;

@SpringBootApplication
@EnableFeignClients
public class WeatherApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(WeatherApplication.class, args);

		context.getBean(MainLogicService.class).run();


	}

}
