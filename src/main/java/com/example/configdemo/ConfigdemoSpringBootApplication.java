package com.example.configdemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class ConfigdemoSpringBootApplication {

    private final Log log = LogFactory.getLog(getClass());

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(ConfigdemoSpringBootApplication.class);
    }
}
