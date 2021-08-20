/**
 * 
 */
package com.ofs.cache.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author USER
 *
 */
@Entity
public class Reader implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5242809653593734057L;
	
	@Id
	private Long id;
	private String name;
	private Long booksRead;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the booksRead
	 */
	public Long getBooksRead() {
		return booksRead;
	}
	/**
	 * @param booksRead the booksRead to set
	 */
	public void setBooksRead(Long booksRead) {
		this.booksRead = booksRead;
	}
	
}
