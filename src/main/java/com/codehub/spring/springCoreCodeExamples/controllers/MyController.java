package com.codehub.spring.springCoreCodeExamples.controllers;

import org.springframework.stereotype.Controller;

//This class annotated as @Controller is a bean managed by the Spring framework
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!! ");

        return "foobar";
    }
}
