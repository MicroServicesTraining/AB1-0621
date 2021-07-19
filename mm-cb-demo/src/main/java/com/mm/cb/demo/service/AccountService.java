/**
 * 
 */
package com.mm.cb.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mm.cb.demo.models.JobPosting;
import com.mm.cb.demo.responses.CBResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author dorak
 *
 */
@Service
public class AccountService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "callAccountsServiceAndGetData_Fallback")
	public CBResponse callAccountsServiceAndGetData() {
		System.out.println("Getting All Accounts Details ");
		/*List<Account> accounts = restTemplate
		.getForObject("http://localhost:8084/as/accounts", List.class);*/
		List<JobPosting> jobs = restTemplate
				.getForObject("http://localhost:8083/mmcsjs/jobs", List.class);
		CBResponse response = new CBResponse();
		response.setResponseData(jobs);
		return response ;
		}	
	
	
	private CBResponse callAccountsServiceAndGetData_Fallback() {
		System.out.println("CIRCUIT BREAKER ENABLED!!! No Response From Accounts Service at this moment. " +
		" Service will be back shortly - " + new Date());
		/*return "CIRCUIT BREAKER ENABLED!!! No Response From Job Postings Service at this moment. " +
				" Service will be back shortly - " + new Date();*/
		CBResponse response = new CBResponse();
		response.setMessage("CIRCUIT BREAKER ENABLED!!! No Response From Accounts Service at this moment. " +
		" Service will be back shortly - " + new Date());
		return response;
		}
}
