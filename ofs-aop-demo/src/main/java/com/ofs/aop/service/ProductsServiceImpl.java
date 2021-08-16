/**
 * 
 */
package com.ofs.aop.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.ofs.aop.model.Product;

/**
 * @author USER
 *
 */
@Service
public class ProductsServiceImpl implements ProductsService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductsServiceImpl.class);
	
	private List<Product> products;
	
	/**
	 * @param products
	 */
	public ProductsServiceImpl() {
		this.products = new ArrayList<Product>();
		this.products.add(new Product(1001L, "Dell Inspiron", 45000.00));
		this.products.add(new Product(1002L, "Lenovo Thinkpad", 35000.00));
		this.products.add(new Product(1003L, "HP Elitebook", 65000.00));
	}



	@Override
	public List<Product> listAllProducts() {
		LOGGER.info("in listAllProducts()");
		return this.products;
	}



	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}



	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}



	@Override
	public Product createProduct(Product product) {
		this.products.add(product);
		return product;
	}



	@Override
	public String removeProduct(Long productId) throws Exception {
		Iterator<Product> it = this.products.iterator();
		if(CollectionUtils.isEmpty(products)) {
			throw new Exception("Products list is empty");
		}
		while(it.hasNext()) {
			Product product = it.next();
			if(productId.equals(product.getProdId())) {
			it.remove();
			return "Product Removed Successfull";
			}
		}
		return "Product not found to remove";
	}

}
