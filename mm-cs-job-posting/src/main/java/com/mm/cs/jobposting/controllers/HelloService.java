/**
 * 
 */
package com.mm.cs.jobposting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController
public class HelloService {
	
	@GetMapping("hello")
	public String sayHello() {
		return "Hello...!";
	}
	
}
