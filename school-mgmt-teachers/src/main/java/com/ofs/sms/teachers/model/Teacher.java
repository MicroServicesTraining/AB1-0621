/**
 * 
 */
package com.ofs.sms.teachers.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * @author USER
 *
 */

@Component
public class Teacher implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4378487016800936193L;
	
	private Long teacherId; // long teacherId; - not standard
	private String name;
	private String subject;
	private Double salary; // double salary; - not recommended, always use wraper classes for member fields declaration
	/**
	 * @return the teacherId
	 */
	public Long getTeacherId() {
		return teacherId;
	}
	/**
	 * @param teacherId the teacherId to set
	 */
	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
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
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
