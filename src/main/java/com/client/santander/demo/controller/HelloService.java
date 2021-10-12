package com.client.santander.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

	public String getSubscriptionDetails(String str) {
		return "Hello"+ str + "Thanks for the subscription";
	}
	
}
