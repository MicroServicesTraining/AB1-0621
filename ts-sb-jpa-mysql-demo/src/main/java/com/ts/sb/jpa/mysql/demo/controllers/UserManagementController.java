/**
 * 
 */
package com.ts.sb.jpa.mysql.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.sb.jpa.mysql.demo.config.MSDemoConfig;
import com.ts.sb.jpa.mysql.demo.model.User;
import com.ts.sb.jpa.mysql.demo.service.UserManagementService;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("users")
//@PropertySources({ @PropertySource(value = "msdemo.properties"), @PropertySource(value = "msdemo1.properties") })
public class UserManagementController {

	@Autowired
	private UserManagementService userManagementService;
	
	@Autowired
	private MSDemoConfig config;

	/*
	 * @Value("${msdemo.title: UserMgmt Service}") private String title;
	 * 
	 * @Value("${msdemo.sub.title}") private String subtitle;
	 */

	@GetMapping
	public String getIndexPage() {
		return "<h1>" + config.getTitle() + "</h1><h2>"+config.getSubtitle()+"</h2>";
	}

	// http://localhost:8090/users/all - GET
	// @RequestMapping(value = "/all", method = RequestMethod.GET)
	@GetMapping("/all")
	public List<User> findAllUsers() {
		// return usersList;
		return userManagementService.findAllUsers();

	}

	@GetMapping("/{id}")
	public User findUserById(@PathVariable(name = "id") Long userId) throws Exception {
		return userManagementService.findUserById(userId);
	}

	@GetMapping("/byusername/{userName}")
	public User findUserByUserName(@PathVariable(name = "userName") String userName) throws Exception {
		return userManagementService.findUserByUserName(userName);
	}

	@PostMapping
	public User addNewUser(@RequestBody User user) {
		return userManagementService.addNeUser(user);
	}

	@PutMapping
	public User updateUser(@RequestBody User user) throws Exception {
		return userManagementService.updateUser(user);
	}

	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Long id) {
		return userManagementService.deleteUser(id);
	}

	@GetMapping("/namestartswith/{name}")
	public List<User> loadUsersNameStartsWith(@PathVariable String name) {
		return userManagementService.loadUsersNameStartsWith(name);
	}

	@GetMapping("/namecontains/{fname}/{lname}")
	public List<User> loadUsersNameContains(@PathVariable String fname, @PathVariable String lname) {
		return userManagementService.loadUsersNameContains(fname, lname);
	}
}
