/**
 * 
 */
package com.mm.cs.jobposting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author dorak
 *
 */
@Configuration
public class JobPostingsConfig {

	@Value("${jp.service.title}")
	private String title;
	
	@Value("${jp.service.count}")
	private Long count;

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
