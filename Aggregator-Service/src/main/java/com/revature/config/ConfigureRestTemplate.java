package com.revature.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //This tells spring that this class has methods that configure and create beans
public class ConfigureRestTemplate {
	
	@Bean //The builder is injected into this method by Spring 
	public RestTemplate restTemplateGenerator(RestTemplateBuilder builder) {
		return builder.build();
	}

}
