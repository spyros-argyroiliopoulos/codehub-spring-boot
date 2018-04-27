package com.codehub.spring.core.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_CODE_HUB = "Hello Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
