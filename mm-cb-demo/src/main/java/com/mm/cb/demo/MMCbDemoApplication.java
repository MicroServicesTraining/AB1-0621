/**
 * 
 */
package com.mm.cb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author dorak
 *
 */
@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class MMCbDemoApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MMCbDemoApplication.class, args);
	}

}
