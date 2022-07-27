package com.example.product.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private boolean isfraud;
	private String email;
}
