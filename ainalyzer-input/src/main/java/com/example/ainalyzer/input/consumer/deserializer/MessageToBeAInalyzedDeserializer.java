package com.example.ainalyzer.input.consumer.deserializer;

import com.example.ainalizer.contracts.MessageToBeAInalyzed;
import com.google.protobuf.InvalidProtocolBufferException;
import org.apache.kafka.common.serialization.Deserializer;

public class MessageToBeAInalyzedDeserializer implements Deserializer<MessageToBeAInalyzed> {
    @Override
    public MessageToBeAInalyzed deserialize(String s, byte[] bytes) {
        try {
            return MessageToBeAInalyzed.parseFrom(bytes);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }
}
