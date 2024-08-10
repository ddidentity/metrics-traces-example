package com.example.dependent_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class DependentApplication
{

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DependentApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("./application.pid"));
		springApplication.run( args);
	}

}
