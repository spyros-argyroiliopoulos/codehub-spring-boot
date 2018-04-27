package com.codehub.spring.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.codehub.spring.core.services.GreetingService;

//This annotation is needed to tell spring that this is a bean
@Controller
public class AutowiredInjectedController {

    //We need this annotation here to know where to Autowire
    @Autowired
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

//    public void setGreetingService(GreetingService greetingService) {
//        this.greetingService = greetingService;
//        System.out.println("Using setter too..");
//    }

//    public AutowiredInjectedController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//        System.out.println("..Or using constructor");
//    }
}
