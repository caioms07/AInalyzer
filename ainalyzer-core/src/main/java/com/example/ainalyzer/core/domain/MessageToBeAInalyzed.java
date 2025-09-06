package com.example.ainalyzer.core.domain;

import lombok.NonNull;
import org.springframework.util.Assert;

public record MessageToBeAInalyzed(@NonNull String messageId,
                                   @NonNull String author,
                                   @NonNull String message) {
    public MessageToBeAInalyzed {
        Assert.hasText(messageId, "messageId cannot be empty");
        Assert.hasText(author, "author cannot be empty");
        Assert.hasText(message, "message cannot be empty");
    }
}
