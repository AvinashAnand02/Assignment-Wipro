package com.example.product_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product_service.model.Product;
import com.example.product_service.repository.ProductService;

@RestController
@RequestMapping("/api/products")
public class AppController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<Product> getProduct(){
		return productService.findAll();
	}
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product product){
		productService.save(product);
	}
	
	
	

}
