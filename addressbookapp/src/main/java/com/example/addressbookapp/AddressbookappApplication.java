package com.example.addressbookapp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressbookappApplication {
	private static final Logger log = LoggerFactory.getLogger(AddressbookappApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(AddressbookappApplication.class, args);
		log.info("App has started!!!");
	}

}
