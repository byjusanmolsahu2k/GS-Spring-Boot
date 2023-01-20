
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//bootstraps spring application
@SpringBootApplication
//to handle incoming http requests
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	//http get method
	//tells Spring to use our hello() method to answer requests that get sent to the http://localhost:8080/hello address.
	@GetMapping("/hello")
	//specifying query parameter
	//@RequestParam is telling Spring to expect a name value in the request
	public String hello(@RequestParam(value = "Anmol", defaultValue = "World") String name, @RequestParam String age) {
		return String.format("Hello %s!\n age: %s", name, age);
	}

}
