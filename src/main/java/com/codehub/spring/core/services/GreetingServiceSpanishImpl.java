package com.codehub.spring.core.services;

public class GreetingServiceSpanishImpl implements GreetingService {

    private static final String HELLO_CODE_HUB = "Hola Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
