
package com.example.addressbookapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AddressbookappApplication {
	private static final Logger log = LoggerFactory.getLogger(AddressbookappApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AddressbookappApplication.class, args);
		log.info("Application has started in {} environment",
				context.getEnvironment().getProperty("environment"));
		log.info("Employee Payroll DB User is {}",
				context.getEnvironment().getProperty("spring.datasource.username"));

	}
}
