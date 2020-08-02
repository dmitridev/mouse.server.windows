package com.example.mouse.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.setProperty("java.awt.headless","false");

		SpringApplication.run(Application.class, args);
	}

}
