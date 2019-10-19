package com.fabio.javacompletoudemy.secao014aula127.domain.entity;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
		super();
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String priceTag() {
		return String.format("%s $ %.2f", name, price);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}
