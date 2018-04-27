package com.codehub.spring.springCoreCodeExamples.services;

import org.springframework.stereotype.Service;

//This annotation is needed to tell spring that this is a bean
@Service
public class GreetingServiceFrenchImpl implements GreetingService {

    public static final String HELLO_CODE_HUB = "Allo Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
