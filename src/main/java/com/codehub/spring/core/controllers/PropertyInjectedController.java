package com.codehub.spring.core.controllers;

import com.codehub.spring.core.services.GreetingService;

public class PropertyInjectedController {

    //This is the dependency
    //Here I need this property to be public so the dependency can be injected
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
