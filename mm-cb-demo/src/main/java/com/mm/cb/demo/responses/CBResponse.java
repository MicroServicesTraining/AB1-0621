/**
 * 
 */
package com.mm.cb.demo.responses;

import java.util.List;

import com.mm.cb.demo.models.JobPosting;

/**
 * @author dorak
 *
 */
public class CBResponse {
	
	private String message;
	private List<JobPosting> responseData;
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
	 * @return the responseData
	 */
	public List<JobPosting> getResponseData() {
		return responseData;
	}
	/**
	 * @param responseData the responseData to set
	 */
	public void setResponseData(List<JobPosting> responseData) {
		this.responseData = responseData;
	}
	
	
}
