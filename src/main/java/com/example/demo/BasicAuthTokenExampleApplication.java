package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BasicAuthTokenExampleApplication extends ServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthTokenExampleApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return super.configure(application);
	}
}
