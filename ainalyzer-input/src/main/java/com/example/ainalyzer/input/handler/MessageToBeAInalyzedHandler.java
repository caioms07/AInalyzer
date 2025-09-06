package com.example.ainalyzer.input.handler;

import com.example.ainalizer.contracts.MessageToBeAInalyzed;
import com.example.ainalyzer.core.driver.MessageToBeAInalyzedHandlerPort;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class MessageToBeAInalyzedHandler implements MessageToBeAInalyzedHandlerPort {

    @Override
    public void handle(MessageToBeAInalyzed messageToBeAInalyzed) {
        log.debug("Message to be ainalyzed: {}, {}, {}",
                messageToBeAInalyzed.getMessageId().getValue(),
                messageToBeAInalyzed.getAuthor().getValue(),
                messageToBeAInalyzed.getMessage().getValue());
    }
}
