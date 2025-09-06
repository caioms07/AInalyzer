package com.example.ainalyzer.core.driver;

import com.example.ainalizer.contracts.MessageToBeAInalyzed;

public interface MessageToBeAInalyzedHandlerPort {

    /**
     * Handles a {@link MessageToBeAInalyzed} event.
     * <p>
     * Implementations of this method define how a message that needs to be analyzed
     * should be consumed, validated, or forwarded for further processing.
     * </p>
     *
     * @param messageToBeAInalyzed the message domain object containing
     *                             the message ID, author, and message content;
     *                             must not be {@code null}
     */
    void handle(MessageToBeAInalyzed messageToBeAInalyzed);

}
