package ru.popov.weather.service.input;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleUserInput implements UserInput {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void showToUser(String message) {
        if (message != null) {
            System.out.println(message);
        } else {
            throw new IllegalArgumentException("Нет сообщения для пользователя");
        }
    }

    @Override
    public String getFromUser() {
        String step = scanner.nextLine();
        if (step != null) {
            return step;
        } else {
            throw new IllegalArgumentException("Неверный формат ввода");
        }
    }
}
