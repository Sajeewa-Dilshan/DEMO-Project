package com.example.demo1;

import com.example.demo1.trials.interfaces.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Demo1Application {



	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}


	@RequestMapping(value = "/demo/{id}",method = RequestMethod.GET)
	public String demo(@RequestParam String id) {
		return "Success" + id;
	}

}
