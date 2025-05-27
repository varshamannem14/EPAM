package com.epam.Demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args); // SpringApplication.run return a ApplicationContext Obj that is IOC container in the JVM where the Spring Objects are create and handled

		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
