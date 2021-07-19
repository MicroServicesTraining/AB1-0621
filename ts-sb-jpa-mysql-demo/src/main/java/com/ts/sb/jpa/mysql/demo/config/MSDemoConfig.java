/**
 * 
 */
package com.ts.sb.jpa.mysql.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * @author USER
 *
 */
@Component
@PropertySources({ @PropertySource(value = "msdemo.properties"), @PropertySource(value = "msdemo1.properties") })
public class MSDemoConfig {

	@Value("${msdemo.title: UserMgmt Service}")
	private String title;

	@Value("${msdemo.sub.title}")
	private String subtitle;

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
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

}
