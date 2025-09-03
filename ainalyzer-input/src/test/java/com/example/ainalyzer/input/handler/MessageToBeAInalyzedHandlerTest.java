package com.example.ainalyzer.input.handler;

import com.example.ainalizer.contracts.MessageToBeAInalyzed;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
class MessageToBeAInalyzedHandlerTest {

    @InjectMocks
    private MessageToBeAInalyzedHandler victim;

    @Test
    void shouldProcessMessageToBeAInalyzed() {
        var message = MessageToBeAInalyzed.getDefaultInstance();
        assertDoesNotThrow(() -> victim.handle(message));
    }

}
