package com.codehub.spring.core.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//This annotation is needed to tell spring that this is a bean
@Service
@Profile("fr")
public class GreetingServiceFrenchImpl implements GreetingService {

    private static final String HELLO_CODE_HUB = "Allo Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
