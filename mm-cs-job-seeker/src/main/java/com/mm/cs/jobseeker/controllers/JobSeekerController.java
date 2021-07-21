/**
 * 
 */
package com.mm.cs.jobseeker.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mm.cs.jobseeker.pojo.JobPosting;
import com.mm.cs.jobseeker.responses.JobPostingResponse;


/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("jobs")
public class JobSeekerController {
	
	private static final Logger LOGGER = Logger.getLogger("JobSeekerController");
	
	@Value("${js.service.title}")
	private String title;
	
	@Value("${js.service.count}")
	private Long count;
	
	@GetMapping("messages")
	public String configMessages() {
		return "<h1>"+this.title+"<h1>"
				+ "<h2> we have morethan "+this.count+" jobseekers are here </h2>";
	}

	@GetMapping
	public List<JobPosting> findAllJobPostings(){
		LOGGER.log(Level.INFO, "findAllJobPosting");
		RestTemplate restTemplate = new RestTemplate();
		List<JobPosting> response = restTemplate.getForObject("http://localhost:8082/mmcsjp/jobpostings", List.class);
		//List<JobPosting> response = restTemplate.getForObject("http://localhost:8090/jobpostings", List.class);
		return response;
	}
	
	@GetMapping("{id}")
	public JobPostingResponse findJobPostingById(@PathVariable Long id) {
		RestTemplate restTemplate = new RestTemplate();
		JobPostingResponse jobPostingResponse = new JobPostingResponse();
		ResponseEntity<JobPosting> response = restTemplate.getForEntity("http://localhost:8082/mmcsjp/jobpostings/"+id, JobPosting.class);
		//ResponseEntity<JobPosting> response = restTemplate.getForEntity("http://localhost:8090/jobpostings/"+id, JobPosting.class);
		response.status(HttpStatus.OK);
		if(response.hasBody()) {
			jobPostingResponse.setStatus(HttpStatus.OK.value());
			jobPostingResponse.setResponse(response.getBody());
		}else {
			jobPostingResponse.setStatus(HttpStatus.NOT_FOUND.value());
			jobPostingResponse.setMessage("No Job posting exists with given id");
		}
		return jobPostingResponse;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the count
	 */
	public Long getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(Long count) {
		this.count = count;
	}
	
}
