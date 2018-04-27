package com.codehub.spring.springCoreCodeExamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codehub.spring.springCoreCodeExamples.vehicle.Car;

@SpringBootApplication
public class SpringCoreCodeExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreCodeExamplesApplication.class, args);

        Travel myTravel = new Travel();
        myTravel.setV(new Car());
        myTravel.startJourney();
	}
}
