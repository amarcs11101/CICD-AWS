package com.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdAwsApplication {
	
	@GetMapping("/")
	String home() {
		System.out.println("Hii its demo !!!!!");
		return "Spring is here!";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdAwsApplication.class, args);
	}

}
