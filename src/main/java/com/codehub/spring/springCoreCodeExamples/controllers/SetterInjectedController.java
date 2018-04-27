package com.codehub.spring.springCoreCodeExamples.controllers;

import org.springframework.stereotype.Controller;

import com.codehub.spring.springCoreCodeExamples.services.GreetingService;

//This annotation is needed to tell spring that this is a bean
@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("Using Setter");
    }
}
