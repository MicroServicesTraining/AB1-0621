/**
 * 
 */
package com.ofs.sb.auth.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */
@RestController
public class OnlineShoppingDemoController {
	
	@GetMapping
	public String showIndexPage() {
		return "<h1>Welcome to Online Shopping</h1>";
	}
	
	@GetMapping("/admin/home")
	public String showAdminPage() {
		return "<h1>Welcome Admin</h1>";
	}
	
	@GetMapping("/admin/createuser")
	public String createUser() {
		return "<h1>Create User Page for Admin</h1>";
	}
	
	@GetMapping("/customer/home")
	public String showCustomerPage() {
		return "<h1>Welcome Customer</h1>";
	}
	
	@GetMapping("/customer/placeorder")
	public String placeOrder() {
		return "<h1>Order Page</h1>";
	}
	
	@GetMapping("/seller/home")
	public String showSellerPage() {
		return "<h1>Welcome Seller</h1>";
	}
	
	@GetMapping("/seller/addproduct")
	public String addProduct() {
		return "<h1>Add New Product here...</h1>";
	}
}
