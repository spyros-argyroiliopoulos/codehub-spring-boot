package com.codehub.spring.core.controllers;

import com.codehub.spring.core.services.GreetingService;

public class AutowiredInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    //To Autowire byType or byName I need to have at my class a public setter method
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("Using setter too..");
    }

    //To Autowire by Constructor I need to have at my class the appropriate public constructor
    //Autowire by constructor will be preferred by Spring if both setter and constructor are present
//    public AutowiredInjectedController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//        System.out.println("..Or using constructor");
//    }
}
