package com.example.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/products")
@AllArgsConstructor
public class ProductRestController {
private final ProductService fcheck;
	private final ProductRepository prepo;
	
	@GetMapping
	public List<Product> getAllProduct(){
		return prepo.findAll();
	}
	
	@PostMapping
	public String addProduct(@RequestBody Product product) {
		
		return fcheck.saveProduct(product);
			
		
	}
	
}
