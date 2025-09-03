package com.example.ainalyzer.input.consumer;

public interface KafkaConsumer<T> {

    void consume(T message);
}
