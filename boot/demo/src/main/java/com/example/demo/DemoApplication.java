package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
	above annotation is combo of 3 annotations-
		@configuration
		@enableautoconfiguration
		@componentscan
*/
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		/*
		   yaha se main start hoga
		*/
	}

}
