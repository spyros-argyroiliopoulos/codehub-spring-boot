package com.codehub.spring.springCoreCodeExamples.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//This annotation is needed to tell spring that this is a bean
@Service
@Primary
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_CODE_HUB = "Hello Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
