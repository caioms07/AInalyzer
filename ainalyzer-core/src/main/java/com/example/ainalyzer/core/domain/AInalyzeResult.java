package com.example.ainalyzer.core.domain;

import lombok.NonNull;
import org.springframework.util.Assert;

public record AInalyzeResult(@NonNull String messageId,
                             @NonNull String author,
                             @NonNull String originalMessage,
                             boolean success,
                             @NonNull String reason) {
    public AInalyzeResult {
        Assert.hasText(messageId, "messageId cannot be empty");
        Assert.hasText(author, "author cannot be empty");
        Assert.hasText(originalMessage, "originalMessage cannot be empty");
        Assert.hasText(reason, "reason cannot be empty");
    }
}
