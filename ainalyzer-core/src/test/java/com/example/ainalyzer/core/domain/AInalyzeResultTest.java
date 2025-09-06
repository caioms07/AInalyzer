package com.example.ainalyzer.core.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AInalyzeResultTest {

    @Test
    void shouldCreateObjectWhenAllArgumentsAreValid() {
        var messageId = "1234";
        var author = "john";
        var originalMessage = "God of War PSN official launch";
        var success = true;
        var reason = "God of War is a Playstation game";
        var ainalyzeResult = new AInalyzeResult(messageId, author, originalMessage, success, reason);

        assertEquals(messageId, ainalyzeResult.messageId());
        assertEquals(author, ainalyzeResult.author());
        assertEquals(originalMessage, ainalyzeResult.originalMessage());
        assertTrue(ainalyzeResult.success());
        assertEquals(reason, ainalyzeResult.reason());
    }

    @ParameterizedTest
    @MethodSource("invalidArguments")
    void shouldThrowExceptionWhenCreatingObjectWithInvalidArguments(String messageId,
                                                                    String author,
                                                                    String originalMessage,
                                                                    boolean success,
                                                                    String reason) {
        assertThrows(IllegalArgumentException.class,
                () -> new AInalyzeResult(messageId, author, originalMessage, success, reason));
    }

    private static Stream<Arguments> invalidArguments() {
        return Stream.of(
                Arguments.of(null, "john", "God of War PSN official launch",
                        true, "God of War is a Playstation game"),
                Arguments.of("", "john", "God of War PSN official launch",
                        true, "God of War is a Playstation game"),
                Arguments.of("1234", null, "God of War PSN official launch",
                        true, "God of War is a Playstation game"),
                Arguments.of("1234", "", "God of War PSN official launch",
                        true, "God of War is a Playstation game"),
                Arguments.of("1234", "john", null,
                        true, "God of War is a Playstation game"),
                Arguments.of("1234", "john", "",
                        true, "God of War is a Playstation game"),
                Arguments.of("1234", "john", "God of War PSN official launch",
                        true, null),
                Arguments.of("1234", "john", "God of War PSN official launch",
                        true, "")
        );
    }

}
