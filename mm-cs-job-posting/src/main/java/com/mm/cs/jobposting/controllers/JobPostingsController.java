/**
 * 
 */
package com.mm.cs.jobposting.controllers;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.cs.jobposting.JobPostingsConfig;
import com.mm.cs.jobposting.entities.JobPosting;
import com.mm.cs.jobposting.repositories.JobPostingRepository;

/**
 * @author dorak
 *
 */
@RefreshScope
@RestController
@RequestMapping("jobpostings")
public class JobPostingsController {
	
	private static final Logger LOGGER = Logger.getLogger("JobPostingsController");
	
	@Autowired
	private JobPostingsConfig jobPostingsConfig;
	
	@Autowired
	private JobPostingRepository jobPostingRepository;
	
	@GetMapping("messages")
	public String configMessages() {
		return "<h1>"+jobPostingsConfig.getTitle()+"<h1>"
				+ "<h2> we have morethan "+jobPostingsConfig.getCount()+" jobs posted here </h2>";
	}
	
	
	@GetMapping
	public List<JobPosting> findAllJobPostings(){
		LOGGER.log(Level.INFO, "findAllJobPostings");
		return jobPostingRepository.findAll();
	}
	
	@GetMapping("{id}")
	public JobPosting findJobPostingById(@PathVariable Long id) {
		try {
		Optional<JobPosting> jobPosting = jobPostingRepository.findById(id);
		return jobPosting.get();
		}catch(Exception e) {
			return null;
		}
	}
	
	@GetMapping("byname/{name}")
	public JobPosting findJobPostingByName(@PathVariable String name) {
		//return jobPostingRepository.findByName(name);
		//return jobPostingRepository.findJobPostingByName(name);
		return jobPostingRepository.getJobPostingByName(name);
	}
}
