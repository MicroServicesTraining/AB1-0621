/**
 * 
 */
package com.mm.cb.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.cb.demo.responses.CBResponse;
import com.mm.cb.demo.service.AccountService;


/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("cbdemo")
public class CircuitBreakerDemoController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping
	public String sayHello() {
		return "<h1>Circuit Breaker Demo Controller</h1>";
	}
	
	@GetMapping("jobs")
	public CBResponse findAllAccounts() {
		return accountService.callAccountsServiceAndGetData();
	}
}
