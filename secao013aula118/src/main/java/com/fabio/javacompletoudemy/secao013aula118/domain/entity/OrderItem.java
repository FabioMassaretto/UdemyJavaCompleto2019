package com.fabio.javacompletoudemy.secao013aula118.domain.entity;

public class OrderItem {
	private Integer quantity;
	//private Double price;
	private Product product;
	
	public OrderItem() {}

	public OrderItem(Integer quantity, Product product/*, Double price*/) {
		this.quantity = quantity;
		this.product = product;
		//this.price = price;
	}
	
	public Double subTotal() {
		return product.getPrice() * quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	/*public Double getPrice() {
		return price;
	}*/
	
	public Product getProduct() {
		return product;
	}

}
