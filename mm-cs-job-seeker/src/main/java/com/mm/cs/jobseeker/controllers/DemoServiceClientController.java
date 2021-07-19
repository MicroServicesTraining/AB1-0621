/**
 * 
 */
package com.mm.cs.jobseeker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("demo")
public class DemoServiceClientController {

	@GetMapping
	public String demoClientService() {
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject("http://localhost:8082/mmcsjp/demo", String.class);
		return response;
	}

}
