package com.example.demo1.model;

import lombok.Data;

@Data
public class GsmFulfilmentOrderSubmitEventDto {

    private String origin;
    private String event;
    private String fulfilmentOrderId;
    private String orderId;
    private String orderType;

}
