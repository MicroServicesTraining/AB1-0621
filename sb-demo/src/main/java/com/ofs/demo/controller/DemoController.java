/**
 * 
 */
package com.ofs.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */

@RestController
public class DemoController {
	
	@GetMapping("welcome")
	public String showWelcomeMessage() {
		return "<h1>Welcome To Springboot</h1>";
	}

}
