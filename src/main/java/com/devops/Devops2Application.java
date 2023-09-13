package com.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@SpringBootApplication
@RestController
public class Devops2Application {
	
	@GetMapping("/")
	public String home() {
		return "devops..........!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Devops2Application.class, args);
	}

}
