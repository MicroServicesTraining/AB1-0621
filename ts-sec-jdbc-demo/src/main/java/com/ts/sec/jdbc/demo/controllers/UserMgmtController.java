/**
 * 
 */
package com.ts.sec.jdbc.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */
@RestController
public class UserMgmtController {

	@GetMapping
	public String showWelcomeMessage() {
		return "<h1>Welcome To Demo Application</h1>";
	}
	
	@GetMapping("users")
	public String loadAllUsers() {
		return "<h1>List of All Users</h1>";
	}
	
	@GetMapping("userhome")
	public String showUserHome() {
		return "<h1>Welcome User </h1>";
	}
	
	@GetMapping("adminhome")
	public String showAdminHome() {
		return "<h1>Welcome Admin</h>";
	}
	
}
