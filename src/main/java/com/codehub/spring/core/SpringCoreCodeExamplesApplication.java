package com.codehub.spring.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codehub.spring.core.controllers.AutowiredInjectedController;
import com.codehub.spring.core.controllers.ConstructorInjectedController;
import com.codehub.spring.core.controllers.SetterInjectedController;

@SpringBootApplication
public class SpringCoreCodeExamplesApplication {
    private static final Logger logger = LogManager.getLogger(SpringCoreCodeExamplesApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringCoreCodeExamplesApplication.class, args);

        AutowiredInjectedController autowiredInjectedController = (AutowiredInjectedController) ctx.getBean("autowiredInjectedController");
        System.out.println(autowiredInjectedController.sayHello());

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayHello());

        logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");
    }
}
