package com.vishnu.firstspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FirstSpringBootAppApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBootAppApplication.class, args);
    }

}
