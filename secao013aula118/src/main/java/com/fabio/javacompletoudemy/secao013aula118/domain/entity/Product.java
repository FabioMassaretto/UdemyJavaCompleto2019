package com.fabio.javacompletoudemy.secao013aula118.domain.entity;

public class Product {
	private String name;
	private Double price;
	
	public Product() {}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}
	
}
