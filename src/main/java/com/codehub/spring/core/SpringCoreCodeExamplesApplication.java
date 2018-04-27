package com.codehub.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codehub.spring.core.controllers.ConstructorInjectedController;
import com.codehub.spring.core.controllers.PropertyInjectedController;
import com.codehub.spring.core.controllers.SetterInjectedController;
import com.codehub.spring.core.services.GreetingServiceImpl;

@SpringBootApplication
public class SpringCoreCodeExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreCodeExamplesApplication.class, args);

        //Constructor Injection
        //When I instantiate the object I pass to it it's dependency (SAFE, BUT NEEDS CONSTRUCTOR)
        ConstructorInjectedController constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
        System.out.println(constructorInjectedController.sayHello());

        //Setter Injection
        //After instantiation I use a setter method to pass the dependency (LESS SAFE, MORE CONVENIENT)
        SetterInjectedController setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
        System.out.println(setterInjectedController.sayHello());

        //Property Injection
        //After instantiation I access the property directly to pass a value (DANGEROUS, I NEED NO-PRIVATE PROPERTY)
        PropertyInjectedController propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
        System.out.println(propertyInjectedController.sayHello());
    }
}
