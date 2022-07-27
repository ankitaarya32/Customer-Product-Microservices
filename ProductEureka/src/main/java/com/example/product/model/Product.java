package com.example.product.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
	@Id
	@SequenceGenerator(
			name = "product_id_sequence",
			sequenceName = "product_id_sequence"
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "product_id_sequence"
			)
	private Integer productId;
	private Integer customerId;
	private String productName;
	private Integer quantity;
	private Double price;
	//private String customerName;
	private LocalDateTime createdAt=LocalDateTime.now();
}
