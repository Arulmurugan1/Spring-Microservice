package com.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController 
{
	@Autowired
	private RestTemplate rst ;
	
	@GetMapping("/payment")
	public String getPayment()
	{
		return rst.getForObject("http://localhost:8081/", String.class);
	}

}
