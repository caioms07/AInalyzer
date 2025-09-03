package com.example.ainalyzer.application.configuration.input;

import com.example.ainalizer.contracts.MessageToBeAInalyzed;
import com.example.ainalyzer.input.consumer.MessageToBeAInalyzedKafkaConsumer;
import com.example.ainalyzer.input.handler.MessageToBeAInalyzedHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

@EnableKafka
@Configuration
public class ConsumerConfig {

    @Bean
    public ConcurrentKafkaListenerContainerFactory concurrentKafkaListenerContainerFactory(
            DefaultKafkaConsumerFactory<String, MessageToBeAInalyzed> defaultConsumerFactory) {
        ConcurrentKafkaListenerContainerFactory<String, MessageToBeAInalyzed> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(defaultConsumerFactory);
        return factory;
    }

    @Bean
    public MessageToBeAInalyzedKafkaConsumer kafkaConsumer(MessageToBeAInalyzedHandler messageToBeAInalyzedHandler) {
        return new MessageToBeAInalyzedKafkaConsumer(messageToBeAInalyzedHandler);
    }

}
