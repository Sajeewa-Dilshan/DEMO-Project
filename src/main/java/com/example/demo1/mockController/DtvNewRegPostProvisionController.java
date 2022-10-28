package com.example.demo1.mockController;

import com.example.demo1.model.mockController.DtvRegPostprovisionCallback;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post-provision-callback")
public class DtvNewRegPostProvisionController {

    @PostMapping("/dtv-new-registration/invoke")
    public Boolean invokeDtvNewRegPostProvision(DtvRegPostprovisionCallback dtvRegPostprovisionCallback, @RequestHeader("Trace_Id") String traceId,
                                                @RequestHeader("Order_Id") String orderId) throws Exception {
        System.out.println(dtvRegPostprovisionCallback);
//        if(dtvRegPostprovisionCallback!=null) {
//            throw new Exception();
//        }
        return true;
    }
}
