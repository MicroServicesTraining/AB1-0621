package com.ofs.sc.apig.demo.ofsscapigdemo;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class OfsScApigDemoApplication {

	private static final Logger LOGGER = Logger.getLogger("OfsScApigDemoApplication");
	
	public static void main(String[] args) {
		SpringApplication.run(OfsScApigDemoApplication.class, args);
	}
	// sleauth follows some standard logging pattern - [application name, traceid, spanid, zipkin-export]
}

