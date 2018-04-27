package com.codehub.spring.springCoreCodeExamples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.codehub.spring.springCoreCodeExamples.services.GreetingService;

//This annotation is needed to tell spring that this is a bean
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //I'm injecting the dependency with through the constructor
    @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("Using Constructor");
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
