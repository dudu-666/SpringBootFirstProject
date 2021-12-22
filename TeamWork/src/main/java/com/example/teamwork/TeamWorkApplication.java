package com.example.teamwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.teamwork.All"})
public class TeamWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamWorkApplication.class, args);
    }

}
