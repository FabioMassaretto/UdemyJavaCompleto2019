package com.fabio.javacompletoudemy.secao013aula118.domain.entity;

import com.fabio.javacompletoudemy.secao013aula118.domain.entity.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private final Date moment = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	private OrderStatus status;
	private Client client;
	private List<OrderItem> orderItems = new ArrayList<>();
	
	public Order() {
	}

	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		orderItems.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItems.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for (OrderItem item : orderItems) {
			total += item.subTotal();
		}
		return total;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ORDER SUMMARY: \n");
		sb.append("Order date: " + sdf.format(moment) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client.getName());
		sb.append(" (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail());
		sb.append("\n Order items: \n");
		
		for (OrderItem item : orderItems) {
			sb.append(item.getProduct().getName() + ", $" + item.getProduct().getPrice());
			sb.append(", Quantity: " + item.getQuantity() + ", Subtotal: " + item.subTotal() + "\n");
		}
		
		sb.append("Total price: $" + total());
		
		return sb.toString();
	}
}
