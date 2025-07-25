package com.example.version.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		log.info("Starting DemoApplication...");
		SpringApplication.run(DemoApplication.class, args);
		log.info("DemoApplication started successfully.");
	}

}
