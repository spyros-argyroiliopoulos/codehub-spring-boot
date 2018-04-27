package com.codehub.spring.springCoreCodeExamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codehub.spring.springCoreCodeExamples.controllers.MyController;

@SpringBootApplication
public class SpringCoreCodeExamplesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringCoreCodeExamplesApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();
    }
}
