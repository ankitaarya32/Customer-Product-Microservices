package com.example.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductEurekaApplication.class, args);
	}

}
