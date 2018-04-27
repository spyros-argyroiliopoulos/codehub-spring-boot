package com.codehub.spring.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.codehub.spring.core.services.GreetingService;

//This annotation is needed to tell spring that this is a bean
@Controller
public class AutowiredInjectedController {

    //We need this annotation here to know where to Autowire
    @Autowired
    @Qualifier("greetingServiceFrenchImpl")
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
