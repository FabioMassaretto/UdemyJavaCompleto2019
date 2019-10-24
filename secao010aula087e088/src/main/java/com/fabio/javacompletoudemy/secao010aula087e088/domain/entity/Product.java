package com.fabio.javacompletoudemy.secao010aula087e088.domain.entity;

public class Product {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
}
