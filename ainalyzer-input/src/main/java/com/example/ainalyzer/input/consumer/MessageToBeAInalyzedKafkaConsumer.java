package com.example.ainalyzer.input.consumer;

import com.example.ainalizer.contracts.MessageToBeAInalyzed;
import com.example.ainalyzer.core.handler.MessageToBeAInalyzedHandler;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

@AllArgsConstructor
@Slf4j
public class MessageToBeAInalyzedKafkaConsumer implements KafkaConsumer<MessageToBeAInalyzed> {

    private MessageToBeAInalyzedHandler messageToBeAInalyzedHandler;

    @Override
    @KafkaListener(topics = "MessageToBeAInalyzedTopic",
            groupId = "group_id",
            containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume(MessageToBeAInalyzed messageToBeAInalyzed) {
        log.debug("MessageToBeAInalyzed consumed: {}, {}, {}",
                messageToBeAInalyzed.getMessageId().getValue(),
                messageToBeAInalyzed.getAuthor().getValue(),
                messageToBeAInalyzed.getMessage().getValue());
        messageToBeAInalyzedHandler.handle(messageToBeAInalyzed);
    }
}
