package com.example.ainalyzer.input.handler;

import com.example.ainalizer.contracts.MessageToBeAInalyzed;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MessageToBeAInalyzedHandler {

    public void handle(MessageToBeAInalyzed messageToBeAInalyzed) {
        System.out.printf("Message to be ainalyzed: %s\n, %s\n, %s\n",
                messageToBeAInalyzed.getMessageId().getValue(),
                messageToBeAInalyzed.getAuthor().getValue(),
                messageToBeAInalyzed.getMessage().getValue());
    }
}
