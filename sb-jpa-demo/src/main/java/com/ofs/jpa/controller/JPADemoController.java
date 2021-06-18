/**
 * 
 */
package com.ofs.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofs.jpa.model.User;
import com.ofs.jpa.service.UserService;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/user")
public class JPADemoController {

	@Autowired
	private UserService userService;

	@GetMapping("/hello")
	public String sayHello() {
		return "<h1>Hello User</h1>";
	}
	
	@GetMapping
	public List<User> listUsers(){
		return userService.listUsers();
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PutMapping
	public User modifyUser(@RequestBody User user) {
		return userService.modifyUser(user);
	}
	
}
