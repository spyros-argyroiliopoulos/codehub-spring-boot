package com.codehub.spring.core.services;

public class GreetingServiceFrenchImpl implements GreetingService {

    private static final String HELLO_CODE_HUB = "Allo Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
