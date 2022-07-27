package com.example.product.service;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.product.model.Customer;
import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {

	private final ProductRepository prepo;
	private final RestTemplate restTemplate;
	
	public String saveProduct(Product product) {
		Customer customer = restTemplate.getForObject("http://CUSTOMER/api/v1/customers/{customerId}", Customer.class,product.getCustomerId());
		
		if(customer.isIsfraud()) return "Product can't be added, Seller is fraud";
		else {
			product=prepo.saveAndFlush(product);
			return "Product added successful "+product.getProductName();
		}
		
		
		//return "Order completed";
		
	}
}
