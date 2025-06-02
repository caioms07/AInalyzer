package com.example.ainalyzer.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AinalyzerApplication {
    protected AinalyzerApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(AinalyzerApplication.class, args);
    }

}
