package com.ofs.cache.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class OfsCacheDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfsCacheDemoApplication.class, args);
	}

}
