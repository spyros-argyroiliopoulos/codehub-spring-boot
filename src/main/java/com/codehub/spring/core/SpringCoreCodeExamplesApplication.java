package com.codehub.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreCodeExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreCodeExamplesApplication.class, args);

        Travel myTravel = new Travel();
        myTravel.startJourney();
	}
}
