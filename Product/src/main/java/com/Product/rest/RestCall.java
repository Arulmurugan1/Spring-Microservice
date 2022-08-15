package com.Product.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestCall 
{
	@Bean
	public RestTemplate getTemplate()
	{
		return new RestTemplate();
	}
}
