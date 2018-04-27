package com.codehub.spring.springCoreCodeExamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class SpringCoreCodeExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreCodeExamplesApplication.class, args);
    }
}
