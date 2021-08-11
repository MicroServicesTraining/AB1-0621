/**
 * 
 */
package com.ofs.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofs.demo.pojo.Employee;


/**
 * @author USER
 *
 */

@RestController
public class DemoController {
	
	@GetMapping("welcome")
	public String showWelcomeMessage() {
		Employee emp = new Employee();
		Employee emp1 = new Employee(1002L);
		emp.setEmpId(1001L);
		emp.getEmpId();
		return "<h1>Welcome To Springboot</h1>";
	}

}
