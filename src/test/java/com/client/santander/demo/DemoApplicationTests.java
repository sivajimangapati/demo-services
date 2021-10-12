package com.client.santander.demo;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import org.junit.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.client.santander.demo.controller.HelloService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {
	
	@Autowired
	private HelloService helloService;
	
	@Autowired
	private TestRestTemplate restTemplate;

	String user = "peter";
	
	@Test
	void contextLoads() {
		URI uri = UriComponentsBuilder.fromUriString("/v1/hello")
				.queryParam("user", user)
				.build()
				.encode()
				.toUri();
		
		String message = this.restTemplate.getForObject(uri, String.class);
		System.out.println(message);
		assertEquals("Hello"+ user + "Thanks for the subscription", message);
				
	}

}
