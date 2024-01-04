package com.example.restApiMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@EntityScan("com.example.restApiMaven")
@ComponentScan("com.example.restApiMaven")
 

public class RestApiMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiMavenApplication.class, args);
	}

}
