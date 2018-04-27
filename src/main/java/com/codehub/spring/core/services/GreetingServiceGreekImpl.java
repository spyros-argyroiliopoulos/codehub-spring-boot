package com.codehub.spring.core.services;

import org.springframework.stereotype.Service;

//This annotation is needed to tell spring that this is a bean
@Service
public class GreetingServiceGreekImpl implements GreetingService {

    public static final String HELLO_CODE_HUB = "Γειά σας Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
