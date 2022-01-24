package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class A_SpringBootProApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(A_SpringBootProApplication.class, args);
		
		//Spring will initialize and create object for Apple
		A_Apple apple = context.getBean(A_Apple.class);
		apple.testApple();
		
	}

}
