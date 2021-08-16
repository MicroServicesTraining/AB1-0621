/**
 * 
 */
package com.ofs.aop.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ofs.aop.aspect.ProductsAspect;
import com.ofs.aop.model.Product;
import com.ofs.aop.service.ProductsService;

/**
 * @author USER
 *
 */
@RestController
public class ProductsController {

	public static final Logger LOGGER = LoggerFactory.getLogger(ProductsController.class);
	
	@Autowired
	private ProductsService productsService;

	@GetMapping
	private List<Product> listAllProducts(){
		LOGGER.info("inside listAllProducts()");
		return productsService.listAllProducts();
	}
	
	@DeleteMapping("/{productId}")
	private String removeProduct(@PathVariable Long productId){
		try {
			return productsService.removeProduct(productId);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
}
