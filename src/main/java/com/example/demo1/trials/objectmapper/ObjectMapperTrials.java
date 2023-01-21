package com.example.demo1.trials.objectmapper;

import com.example.demo1.trials.objectmapper.model.CallbackEventBase;
import com.example.demo1.trials.objectmapper.model.CallbackEventClosure;
import com.example.demo1.trials.objectmapper.model.CallbackEventIntermediate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class ObjectMapperTrials {

    public static void main(String[] args) throws JsonProcessingException {
//        ObjectMapper objectMapper= new ObjectMapper();
//        String callbackEventString="{ \"fulfilmentOrderId\": \"6356353653da385a1c01732e\", \"traceId\": \"GSM123456\", \"origin\": \"orchestrator\", \"event\": \"GSM_REG\", \"orderType\": \"GSM_REGISTRATION\" }";
//
//
//        CallbackEventBase result = callbackEventString.contains("Result") ?
//                objectMapper.readValue(callbackEventString, CallbackEventClosure.class) :
//                objectMapper.readValue(callbackEventString, CallbackEventIntermediate.class);
//        System.out.println(result);

        Long miliSec = 1666868055807L;
        // create an instance of the SimpleDateFormat class for modifying the date object
        DateFormat obj = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z");
        // we create instance of the Date and pass milliseconds to the constructor
        Date res = new Date(miliSec);
        // now we format the res by using SimpleDateFormat
        System.out.println(obj.format(res));
        Long miliSec2 = 1666868055813L;
        // create an instance of the SimpleDateFormat class for modifying the date object

        // we create instance of the Date and pass milliseconds to the constructor
        Date res2 = new Date(miliSec2);
        // now we format the res by using SimpleDateFormat
        System.out.println(obj.format(res2));

        long l = System.currentTimeMillis();
        System.out.println(l);
        Date res3 = new Date(l);
        System.out.println(obj.format(res3));
    }
}
