package com.example.demo1.controller.beanenable;

import com.example.demo1.controller.beanenable.beans.SampleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/bean-enable")
@RestController
public class BeanEnableControllers {

    @Autowired
    private SampleBean sampleBean;

    @GetMapping("/change")
    public String changeBean(@RequestHeader("value") String value){
        sampleBean.setName1(value);
        return "Success ";
    }


    @GetMapping("/check")
    public Boolean checkValue(){

        return "Y".equals(sampleBean.getName1());
    }
}
