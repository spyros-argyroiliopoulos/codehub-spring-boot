package com.codehub.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codehub.spring.core.controllers.AutowiredInjectedController;
import com.codehub.spring.core.controllers.ConstructorInjectedController;
import com.codehub.spring.core.controllers.SetterInjectedController;
import com.codehub.spring.core.services.GreetingService;
import com.codehub.spring.core.services.GreetingServiceImpl;

@Configuration
public class SpringConfig {

    //    Bean declaration
    @Bean(name = "greetingService")
    public GreetingService getGreetingService() {
        return new GreetingServiceImpl();
    }

    //    Setter Injection
    @Bean(name = "setterInjectedController")
    public SetterInjectedController getSetterInjectedController() {
        SetterInjectedController setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(getGreetingService());
        return setterInjectedController;
    }

    //    Constructor Injection
    @Bean(name = "constructorInjectedController")
    public ConstructorInjectedController getCustomerService() {
        ConstructorInjectedController constructorInjectedController = new ConstructorInjectedController(getGreetingService());
        return constructorInjectedController;
    }

    //    Use autowire with this bean, the same with bean declaration
    @Bean(name = "autowiredInjectedController")
    public AutowiredInjectedController getAutowiredInjectedController() {
        return new AutowiredInjectedController();
    }

}
