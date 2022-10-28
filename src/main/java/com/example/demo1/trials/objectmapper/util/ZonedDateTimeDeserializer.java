package com.example.demo1.trials.objectmapper.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeDeserializer extends StdDeserializer<ZonedDateTime> {
    public static final String ZONED_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX";
    transient DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ZONED_DATE_TIME_FORMAT);

    public ZonedDateTimeDeserializer() {
        super(ZonedDateTime.class);
    }

    public ZonedDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return ZonedDateTime.parse(p.readValueAs(String.class), this.formatter);
    }
}