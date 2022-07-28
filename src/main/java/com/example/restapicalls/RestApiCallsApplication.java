package com.example.restapicalls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiCallsApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to messaging application demonstrates REST API calls ");
        SpringApplication.run(RestApiCallsApplication.class, args);
    }
}