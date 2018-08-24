package com.example.configdemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigdemoProfileApplication {

    private final Log log = LogFactory.getLog(getClass());

    public static void main(String[] args) throws Throwable {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.getEnvironment().setActiveProfiles("dev"); // <4>
        ac.register(ConfigdemoProfileApplication.class);
        ac.refresh();
    }
}