package com.spring.demo;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootPracticesApplicationTests {
    public static Logger logger =(Logger) LoggerFactory.getLogger(SpringBootPracticesApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Hello Test ");
	}

}
