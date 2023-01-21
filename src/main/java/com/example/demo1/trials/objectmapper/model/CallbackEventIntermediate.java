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
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(callSuper=true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CallbackEventIntermediate extends CallbackEventBase {

    @JsonProperty("orderReferenceId")
    private String orderReferenceId;

    @JsonProperty("eventKey")
    private String eventKey;

    @JsonProperty("eventName")
    private String eventName;
    @JsonProperty("completedDateTime")
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    private ZonedDateTime completedDateTime;
    @JsonProperty("params")
    private Params params;
}