package com.github.kumarvikas1.web.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.github"})
public class CoolBotsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoolBotsApplication.class, args);
    }
}
