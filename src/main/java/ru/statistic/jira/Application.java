package ru.statistic.jira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void  main(String[] args) {
        System.out.println("Начало запуска приожения");
        SpringApplication.run(Application.class, args);
        System.out.println("Модуль успешно запущен");
    }
}