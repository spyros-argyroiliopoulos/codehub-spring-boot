package com.codehub.spring.core.controllers;

import com.codehub.spring.core.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    //I'm injecting the dependency with a setter
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("Using Setter");
    }
}
