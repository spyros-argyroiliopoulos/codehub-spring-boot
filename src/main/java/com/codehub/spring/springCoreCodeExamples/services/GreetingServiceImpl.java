package com.codehub.spring.springCoreCodeExamples.services;

import org.springframework.stereotype.Service;

//This class annotated as @Service is a bean managedd by the Spring framework
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_CODE_HUB = "Hello Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
