/**
 * 
 */
package com.mm.cs.jobseeker.pojo;

/**
 * @author dorak
 *
 */
public class JobPosting {

	private Long postingId;
	private String name;
	private String description;
	
	/**
	 * @return the postingId
	 */
	public Long getPostingId() {
		return postingId;
	}
	/**
	 * @param postingId the postingId to set
	 */
	public void setPostingId(Long postingId) {
		this.postingId = postingId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
		
}
