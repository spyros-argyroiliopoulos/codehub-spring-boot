package com.codehub.spring.springCoreCodeExamples.controllers;

import com.codehub.spring.springCoreCodeExamples.services.GreetingService;

public class PropertyInjectedController {

    //Here I need this property to be public so the dependency can be injected
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
