package com.fabio.javacompletoudemy.secao009aula074.domain.entity;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Double totalInStock() {
		return (this.price * this.quantity);
	}
	
	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeQuantity(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Name: " + this.name + 
				", $ " + String.format("%.2f", this.price) + 
				", " + this.quantity + 
				" unit, total $ " + String.format("%.2f", totalInStock());
	}
}
