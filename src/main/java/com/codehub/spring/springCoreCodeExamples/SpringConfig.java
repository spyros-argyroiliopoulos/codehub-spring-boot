package com.codehub.spring.springCoreCodeExamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codehub.spring.springCoreCodeExamples.controllers.AutowiredInjectedController;
import com.codehub.spring.springCoreCodeExamples.controllers.ConstructorInjectedController;
import com.codehub.spring.springCoreCodeExamples.controllers.SetterInjectedController;
import com.codehub.spring.springCoreCodeExamples.services.GreetingService;
import com.codehub.spring.springCoreCodeExamples.services.GreetingServiceImpl;

@Configuration
public class SpringConfig {

    //    just bean declaration
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

    //    use autowire with this bean, the same with bean declaration
    @Bean(name = "autowiredInjectedController")
    public AutowiredInjectedController getAutowiredInjectedController() {
        AutowiredInjectedController autowiredInjectedController = new AutowiredInjectedController();
        return autowiredInjectedController;
    }

}
