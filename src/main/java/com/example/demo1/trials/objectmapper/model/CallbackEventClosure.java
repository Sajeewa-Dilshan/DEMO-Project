package com.example.demo1.trials.objectmapper.model;

import com.example.demo1.trials.objectmapper.util.ZonedDateTimeDeserializer;
import com.example.demo1.trials.objectmapper.util.ZonedDateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.time.ZonedDateTime;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(callSuper=true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CallbackEventClosure extends CallbackEventBase {

    @JsonProperty("orderReference")
    private String orderReference;

    @JsonProperty("acceptDateTime")
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    private ZonedDateTime acceptDateTime;
    @JsonProperty("orderStatus")
    private String orderStatus;
    @JsonProperty("completeDateTime")
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    private ZonedDateTime completedDateTime;
    @JsonProperty("Result")

    private Result result;
}