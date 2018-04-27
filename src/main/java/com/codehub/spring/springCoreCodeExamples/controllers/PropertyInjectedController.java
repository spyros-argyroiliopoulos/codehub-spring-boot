package com.codehub.spring.springCoreCodeExamples.controllers;

import com.codehub.spring.springCoreCodeExamples.services.GreetingServiceImpl;

public class PropertyInjectedController {

    //Here I'm using the Class not the interface
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
