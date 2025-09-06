package com.example.ainalyzer.core.mapper;

import com.example.ainalyzer.core.domain.MessageToBeAInalyzed;
import com.google.protobuf.StringValue;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageToBeAInalyzedConverter {

    MessageToBeAInalyzed toDomain(com.example.ainalizer.contracts.MessageToBeAInalyzed messageToBeAInalyzed);

    default String stringValuetoString(StringValue stringValue) {
        return stringValue.getValue();
    }
}
