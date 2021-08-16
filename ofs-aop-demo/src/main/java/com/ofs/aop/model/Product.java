/**
 * 
 */
package com.ofs.aop.model;

/**
 * @author USER
 *
 */
public class Product {

	private Long prodId;
	private String name;
	private Double price;
	public Product(long prodId, String name, double price) {
		this.prodId = prodId;
		this.name = name;
		this.price = price;
	}
	/**
	 * @return the prodId
	 */
	public Long getProdId() {
		return prodId;
	}
	/**
	 * @param prodId the prodId to set
	 */
	public void setProdId(Long prodId) {
		this.prodId = prodId;
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
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
