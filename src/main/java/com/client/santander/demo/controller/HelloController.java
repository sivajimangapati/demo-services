package com.client.santander.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam String user) {
		return helloService.getSubscriptionDetails(user);
		
	}
	
	@GetMapping("/hello1")
	public String sayHello1() {
		return "hey";
		
	}
}
