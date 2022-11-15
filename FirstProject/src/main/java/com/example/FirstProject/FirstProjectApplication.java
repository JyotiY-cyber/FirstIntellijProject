package com.example.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {

	ConfigurableApplicationContext context=SpringApplication.run(FirstProjectApplication.class, args);
		//System.out.println("welcome to Spring boot");
		Employee emp=context.getBean(Employee);
		System.out.println(emp.getEid());

	}

}
