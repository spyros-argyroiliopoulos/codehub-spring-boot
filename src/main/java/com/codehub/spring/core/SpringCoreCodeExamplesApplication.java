package com.codehub.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.codehub.spring.core.controllers.AutowiredInjectedController;
import com.codehub.spring.core.controllers.SetterInjectedController;
import com.codehub.spring.core.controllers.ConstructorInjectedController;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class SpringCoreCodeExamplesApplication {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("es");
        ctx.load("app-config.xml");
        ctx.refresh();

        AutowiredInjectedController autowiredInjectedController = (AutowiredInjectedController) ctx.getBean("autowiredInjectedController");
        System.out.println(autowiredInjectedController.sayHello());

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayHello());
    }
}
