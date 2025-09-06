package com.example.ainalyzer.core.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MessageToBeAInalyzedTest {

    @Test
    void shouldCreateObjectWhenAllArgumentsAreValid() {
        var messageId = "1234";
        var author = "john";
        var message = "God of War PSN official launch";
        var messageToBeAInalyzed = new MessageToBeAInalyzed(messageId, author, message);

        assertEquals(messageId, messageToBeAInalyzed.messageId());
        assertEquals(author, messageToBeAInalyzed.author());
        assertEquals(message, messageToBeAInalyzed.message());
    }

    @ParameterizedTest
    @MethodSource("invalidArguments")
    void shouldThrowExceptionWhenCreatingObjectWithInvalidArguments(String messageId,
                                                                    String author,
                                                                    String message) {
        assertThrows(IllegalArgumentException.class, () -> new MessageToBeAInalyzed(messageId, author, message));
    }

    private static Stream<Arguments> invalidArguments() {
        return Stream.of(
                Arguments.of(null, "john", "God of War PSN official launch"),
                Arguments.of("", "john", "God of War PSN official launch"),
                Arguments.of("1234", null, "God of War PSN official launch"),
                Arguments.of("1234", "", "God of War PSN official launch"),
                Arguments.of("1234", "john", null),
                Arguments.of("1234", "john", "")
        );
    }
}
