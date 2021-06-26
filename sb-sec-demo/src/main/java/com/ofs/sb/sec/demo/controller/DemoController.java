/**
 * 
 */
package com.ofs.sb.sec.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */
@RestController
public class DemoController {
	
	@GetMapping
	public String showIndexPage() {
		return "<h1>Welcome To Demo Application</h1>";
	}

}
