package com.codehub.spring.springCoreCodeExamples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.codehub.spring.springCoreCodeExamples.services.GreetingService;

//This annotation is needed to tell spring that this is a bean
@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    //I'm injecting the dependency with a setter
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("Using Setter");
    }
}
