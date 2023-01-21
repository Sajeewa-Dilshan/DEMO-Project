package com.example.demo1.trials.objectmapper.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeSerializer extends StdSerializer<ZonedDateTime> {
    public static final String ZONED_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX";

    transient DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ZONED_DATE_TIME_FORMAT);

    public ZonedDateTimeSerializer() {
        super(ZonedDateTime.class);
    }

    public void serialize(ZonedDateTime value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeString(value.format(this.formatter));
    }
}
