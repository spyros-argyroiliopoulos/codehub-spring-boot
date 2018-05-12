package com.codehub.spring.core.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringLoggingHelper {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void helpMethod() {
        logger.trace("Hey I'm a trace message!");
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
    }
}
