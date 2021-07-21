/**
 * 
 */
package com.mm.cs.jobposting.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mm.cs.jobposting.responses.Account;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("/accounts")
public class Accountcontroller {

	@GetMapping
	public List<Account> getAccounts() {
		List<Account> responseEntity = 
				   (List<Account>) new RestTemplate().getForObject(
		        "http://localhost:8084/as/accounts", List.class);
		return responseEntity;
	}
	
}
