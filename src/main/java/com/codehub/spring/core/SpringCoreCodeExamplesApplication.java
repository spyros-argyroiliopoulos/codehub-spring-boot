package com.codehub.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codehub.spring.core.controllers.AutowiredInjectedController;
import com.codehub.spring.core.controllers.ConstructorInjectedController;
import com.codehub.spring.core.controllers.SetterInjectedController;

@SpringBootApplication
public class SpringCoreCodeExamplesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringCoreCodeExamplesApplication.class, args);

        AutowiredInjectedController autowiredInjectedController = (AutowiredInjectedController) ctx.getBean("autowiredInjectedController");
        System.out.println(autowiredInjectedController.sayHello());

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayHello());
    }
}
