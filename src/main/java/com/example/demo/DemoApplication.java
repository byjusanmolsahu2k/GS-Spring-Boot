
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//bootstraps spring application by implicit addition of several necessary annotations
@SpringBootApplication
//to handle incoming/outgoing http requests
@RestController
public class DemoApplication {

	//to launch the web application
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	//http get method
	//@GetMapping maps endpoint '/hello' to hello() method to answer requests that get sent to the http://localhost:8080/hello address.
	@GetMapping("/hello")
	//specifying query parameter
	//@RequestParam binds name variable with name value in the request url query parameter
	//URL Pattern: /params?key=value&key1=value1 
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam String age) {
		return String.format("Hello %s! age: %s", name, age);
	}

}
