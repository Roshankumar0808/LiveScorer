package com.crick.aps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//This annotation is a convenience annotation that adds all the following:
//@Configuration: Tags the class as a source of bean definitions for the
//application context.
//@EnableAutoConfiguration: Tells Spring Boot to start adding beans based
//on classpath settings, other beans, and various property settings.
//@ComponentScan: Tells Spring to look for other components,
//configurations, and services in the com.crick.aps package,
//allowing it to find the controllers and other classes.
public class LiveScoreBackendApplication {
//	This method uses SpringApplication.run() to launch the Spring
//	Boot application.
	public static void main(String[] args) {
		SpringApplication.run(LiveScoreBackendApplication.class, args);
	}

}
