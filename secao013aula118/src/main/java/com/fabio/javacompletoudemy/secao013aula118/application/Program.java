package com.fabio.javacompletoudemy.secao013aula118.application;

import com.fabio.javacompletoudemy.secao013aula118.domain.entity.Client;
import com.fabio.javacompletoudemy.secao013aula118.domain.entity.Order;
import com.fabio.javacompletoudemy.secao013aula118.domain.entity.OrderItem;
import com.fabio.javacompletoudemy.secao013aula118.domain.entity.Product;
import com.fabio.javacompletoudemy.secao013aula118.domain.entity.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao008aula100
public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter Client information: ");
		System.out.print("Name: ");
		String clientName = sc.next();
		System.out.print("Email: ");
		String clientEmail = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientBirth =  sdf.parse(sc.next());
		
		System.out.println("Enter Order information: ");
		System.out.print("Status: ");
		String orderStatus = sc.next();
		System.out.print("How many itemsn to this order? ");
		int numberItemsOrder = sc.nextInt();
		Order order = new Order(OrderStatus.valueOf(orderStatus),
				new Client(clientName, clientEmail, clientBirth));
		
		for (int i = 1; i <= numberItemsOrder; i++) {
			System.out.printf("Enter #%d item data:%n", i);
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(productQuantity,
					new Product(productName, productPrice));
						
			order.addItem(orderItem);
		}
		
		System.out.println(order);
		
		sc.close();
	}
}
