package com.example.metrics_traces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MetricsTracesApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(MetricsTracesApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("./application.pid"));
		springApplication.run( args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
