package com.spring.demo;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPracticesApplication {
    
	  public static Logger logger =(Logger) LoggerFactory.getLogger(SpringBootPracticesApplication.class);
	  public void init() {
		  logger.info("Apllication started");
	  }
	public static void main(String[] args) {
		logger.info("Apllication Excetueed");
		SpringApplication.run(SpringBootPracticesApplication.class, args);
	}

}
