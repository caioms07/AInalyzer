package com.example.ainalyzer.application.configuration.input;

import com.example.ainalyzer.input.handler.MessageToBeAInalyzedHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HandlerConfig {

    @Bean
    public MessageToBeAInalyzedHandler messageToBeAInalyzedHandler() {
        return new MessageToBeAInalyzedHandler();
    }

}
