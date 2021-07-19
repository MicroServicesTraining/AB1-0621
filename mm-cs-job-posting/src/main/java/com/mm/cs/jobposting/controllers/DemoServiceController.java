/**
 * 
 */
package com.mm.cs.jobposting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("demo")
public class DemoServiceController {

	@GetMapping
	public String demoService() {
		return "Response From Demo Service Controller";
	}

}
