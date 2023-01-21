package com.example.demo1.mockController.provisioningmediator;

import com.example.demo1.model.mockController.provisioningmediator.ProvisionResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/objectione")
public class CreateOrderController {

    @PutMapping("/create-order/1.0.0/orchestra/v1/GSM/CREATE_GSM")
    public ProvisionResponse createOrder(@RequestHeader("Trace_Id") String traceId, @RequestParam("traceId") String traceId1){
        Map<String, Object> result= new HashMap<>();
        result.put("code","code");
        result.put("description","description");

        return ProvisionResponse.builder()
                .message("received")
                .timestamp(LocalDateTime.now().toString())
                .orderId("245542")
                .acceptDateTime(LocalDateTime.now().minusDays(25).toString())
                .orderReference("9003024868")
                .orderStatus("success")
                .result(result)
                .build();

    }
}
