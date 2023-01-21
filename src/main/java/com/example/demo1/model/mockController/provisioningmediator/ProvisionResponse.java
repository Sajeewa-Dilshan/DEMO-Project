package com.example.demo1.model.mockController.provisioningmediator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class ProvisionResponse {

    private int status;
    private String message;
    private String error;
    private List<Object> errors;
    private String path;
    private String timestamp;
    private String orderId;
    private String acceptDateTime;
    private String orderReference;
    private String orderStatus;

    @JsonProperty("Result")
    private Map<String, Object> result;

}
