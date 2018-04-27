package com.codehub.spring.core.controllers;

import com.codehub.spring.core.services.GreetingService;

public class ConstructorInjectedController {

    //This is the dependency
    private GreetingService greetingService;

    //I'm injecting the dependency with through the constructor
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
