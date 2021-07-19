/**
 * 
 */
package com.mm.sc.sd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("sdc")
public class ServiceDiscoveryClient {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String sayHello() {
		return "<h1>Hello from Discovery Client....</h1>";
	}

	@GetMapping(value = "/dcc")
	public String getDemoClient() {

		String response = restTemplate.getForObject("http://CLIENT-SERVICE/dcc", String.class);

		return response;
	}

	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
