package com.fabio.javacompletoudemy.secao017aula181.domain.entity;

public class Product {

	private String name;
	private Double price;
	private Integer quantity;
	
	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
		
	public Double totalPrice() {
		return price * quantity;
	}

	public String getName() {
		return name;
	}
	
}
