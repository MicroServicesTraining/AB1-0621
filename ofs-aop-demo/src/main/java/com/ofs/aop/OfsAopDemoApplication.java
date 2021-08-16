package com.ofs.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class OfsAopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfsAopDemoApplication.class, args);
	}

}
