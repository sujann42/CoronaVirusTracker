package com.corona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaVirsuTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaVirsuTrackerApplication.class, args);
		System.out.println("Application started!!!!");
	}

}
