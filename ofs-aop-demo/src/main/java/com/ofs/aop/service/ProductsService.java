/**
 * 
 */
package com.ofs.aop.service;

import java.util.List;

import com.ofs.aop.model.Product;

/**
 * @author USER
 *
 */
public interface ProductsService {

	List<Product> listAllProducts();
	
	Product createProduct(Product product);
	String removeProduct(Long productId) throws Exception;
	

}
