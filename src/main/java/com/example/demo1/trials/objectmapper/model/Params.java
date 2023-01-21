package com.example.demo1.trials.objectmapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Params {
    @JsonProperty("values")
    private List<PostProvisionCallbackCharacteristic> values;
}
