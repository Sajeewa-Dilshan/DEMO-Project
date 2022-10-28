package com.example.demo1.trials.objectmapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class CallbackEventBase implements SqsObject {

    @JsonProperty("orderId")
    private String orderId;
    @JsonProperty("values")
    private List<PostProvisionCallbackCharacteristic> values;
}