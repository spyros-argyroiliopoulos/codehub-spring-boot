package com.codehub.spring.core.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import com.codehub.spring.core.helpers.SpringLoggingHelper;

@Controller
public class SomeController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void showMeSomeLog() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        new SpringLoggingHelper().helpMethod();
    }
}
