package com.example.ainalyzer.application.configuration.core;

import com.example.ainalyzer.core.handler.MessageToBeAInalyzedHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HandlerConfig {

    @Bean
    public MessageToBeAInalyzedHandler messageToBeAInalyzedHandler() {
        return new MessageToBeAInalyzedHandler();
    }

}
