package com.example.configdemo;

import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConfigdemoApplication {
	
	public static void main(String[] args) {
	new ClassPathXmlApplicationContext("classic.xml");
}

	public void setConfigurationProjectName(String pn) {
		LogFactory.getLog(getClass()).info("the configuration project name is " + pn);
	}
}
