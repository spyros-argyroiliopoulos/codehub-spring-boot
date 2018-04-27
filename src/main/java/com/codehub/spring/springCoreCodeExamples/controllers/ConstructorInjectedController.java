package com.codehub.spring.springCoreCodeExamples.controllers;

import com.codehub.spring.springCoreCodeExamples.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController() {
    }

    //I'm injecting the dependency with through the constructor
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("Using Constructor");
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
