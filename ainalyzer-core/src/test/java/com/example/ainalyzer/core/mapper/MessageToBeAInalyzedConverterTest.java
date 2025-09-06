package com.example.ainalyzer.core.mapper;

import com.example.ainalizer.contracts.MessageToBeAInalyzed;
import com.google.protobuf.StringValue;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageToBeAInalyzedConverterTest {

    private final MessageToBeAInalyzedConverter victim =
            Mappers.getMapper(MessageToBeAInalyzedConverter.class);

    @Test
    void shouldSuccessfullyConvertMessageToBeAInalyzed() {
        var messageId = "1234";
        var author = "john";
        var message = "God of War PSN official launch";
        var messageToBeAInalyzed = MessageToBeAInalyzed.newBuilder()
                .setMessageId(StringValue.of(messageId))
                .setAuthor(StringValue.of(author))
                .setMessage(StringValue.of(message))
                .build();

        var result = victim.toDomain(messageToBeAInalyzed);

        assertEquals(messageId, result.messageId());
        assertEquals(author, result.author());
        assertEquals(message, result.message());
    }
}
