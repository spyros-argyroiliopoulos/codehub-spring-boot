package com.codehub.spring.springCoreCodeExamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codehub.spring.springCoreCodeExamples.controllers.ConstructorInjectedController;
import com.codehub.spring.springCoreCodeExamples.controllers.MyController;
import com.codehub.spring.springCoreCodeExamples.controllers.PropertyInjectedController;
import com.codehub.spring.springCoreCodeExamples.controllers.SetterInjectedController;
import com.codehub.spring.springCoreCodeExamples.services.GreetingServiceImpl;

@SpringBootApplication
public class SpringCoreCodeExamplesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringCoreCodeExamplesApplication.class, args);

        //Using the bean from context
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();

        //Property Injection
        PropertyInjectedController propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
        System.out.println(propertyInjectedController.sayHello());

        //Setter Injection
        SetterInjectedController setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
        System.out.println(setterInjectedController.sayHello());

        //Constructor Injection
        ConstructorInjectedController constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
        System.out.println(constructorInjectedController.sayHello());
    }
}
