package com.example.ainalyzer.input.consumer;

import com.example.ainalizer.contracts.MessageToBeAInalyzed;
import com.example.ainalyzer.input.handler.MessageToBeAInalyzedHandler;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MessageToBeAInalyzedKafkaConsumer implements KafkaConsumer<MessageToBeAInalyzed> {

    private MessageToBeAInalyzedHandler messageToBeAInalyzedHandler;

    @Override
    @KafkaListener(topics = "MessageToBeAInalyzedTopic",
            groupId = "group_id",
            containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume(MessageToBeAInalyzed messageToBeAInalyzed) {
        messageToBeAInalyzedHandler.handle(messageToBeAInalyzed);
    }
}
