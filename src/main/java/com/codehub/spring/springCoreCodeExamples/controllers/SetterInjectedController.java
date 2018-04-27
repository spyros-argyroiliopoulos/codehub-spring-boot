package com.codehub.spring.springCoreCodeExamples.controllers;

import com.codehub.spring.springCoreCodeExamples.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    //I'm injecting the dependency with a setter
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
