package com.codehub.spring.springCoreCodeExamples.controllers;

import com.codehub.spring.springCoreCodeExamples.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
