/**
 * 
 */
package com.mm.cs.jobposting.responses;

import com.mm.cs.jobposting.pojo.JobPosting;

/**
 * @author dorak
 *
 */
public class JobPostingResponse {
	
	private Integer status;
	private String message;
	private JobPosting response;
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the response
	 */
	public JobPosting getResponse() {
		return response;
	}
	/**
	 * @param response the response to set
	 */
	public void setResponse(JobPosting response) {
		this.response = response;
	}
	
}
