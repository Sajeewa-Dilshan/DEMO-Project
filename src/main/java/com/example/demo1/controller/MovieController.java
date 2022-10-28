package com.example.demo1.controller;

import com.example.demo1.model.Customer;
import com.example.demo1.service.CustomerService;
import com.example.demo1.trials.interfaces.Vehicle;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
@CrossOrigin
public class MovieController {


    @Autowired
    private  CustomerService customerService;

    @Autowired
    ObjectMapper objectMapper;

    @PatchMapping(path = "/{id}",consumes = "application/json-patch+json")
    public Customer patchMovie(@PathVariable(value = "id") String id,
                               @RequestBody JsonPatch patch){
        Customer updatedCustomer=null;
        System.out.println("DFghdrh");
        List<String> list=new ArrayList<>();
        list.add("milk");
        list.add("egg");
        System.out.println(customerService);
        try{
            Customer customer= new Customer("1","456", list);
            Customer customerPatched=applyPatchToCustomer(patch,customer);
            updatedCustomer=customerPatched;
            System.out.println(customerPatched);
        }catch (Exception e){
            e.printStackTrace();

        }
        return updatedCustomer;
    }

    private Customer applyPatchToCustomer(
            JsonPatch patch, Customer targetCustomer) throws JsonPatchException, JsonProcessingException {

        JsonNode patched = patch.apply(objectMapper.convertValue(targetCustomer, JsonNode.class));
        return objectMapper.treeToValue(patched, Customer.class);
    }


    @GetMapping("/aser")
    public String getString(){
        return "{ \"f\":\"HI\"}";
    }
}
