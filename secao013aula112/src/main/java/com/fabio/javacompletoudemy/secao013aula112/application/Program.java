package com.fabio.javacompletoudemy.secao013aula112.application;

import com.fabio.javacompletoudemy.secao013aula112.domain.entity.Order;
import com.fabio.javacompletoudemy.secao013aula112.domain.enums.OrderStatus;

import java.util.Date;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao008aula094
public class Program {

	public static void main(String[] args) {
		Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
