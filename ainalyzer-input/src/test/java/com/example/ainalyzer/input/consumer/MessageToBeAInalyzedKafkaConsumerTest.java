package com.example.ainalyzer.input.consumer;

import com.example.ainalizer.contracts.MessageToBeAInalyzed;
import com.example.ainalyzer.input.handler.MessageToBeAInalyzedHandler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@ExtendWith(MockitoExtension.class)
class MessageToBeAInalyzedKafkaConsumerTest {

    @Mock
    private MessageToBeAInalyzedHandler messageToBeAInalyzedHandlerMock;

    @InjectMocks
    private MessageToBeAInalyzedKafkaConsumer victim;

    @Test
    void shouldConsumeMessageToBeAInalyzed() {
        var message = MessageToBeAInalyzed.getDefaultInstance();
        doNothing().when(messageToBeAInalyzedHandlerMock).handle(message);

        victim.consume(message);

        verify(messageToBeAInalyzedHandlerMock).handle(message);
        verifyNoMoreInteractions(messageToBeAInalyzedHandlerMock);
    }

}
