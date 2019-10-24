package com.fabio.javacompletoudemy.secao010aula087e088.application;

import com.fabio.javacompletoudemy.secao010aula087e088.domain.entity.Product;

import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao005aula069e070
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 *  Aula 69
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}		
		
		double avg = sum / vect.length;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		*/
		
		// Aula 70
		int n = sc.nextInt();
		
		Product[] productVect = new Product[n];
		
		for (int i = 0; i < productVect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			productVect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < productVect.length; i++) {
			sum += productVect[i].getPrice();
		}
		
		double avg = sum / productVect.length;
		
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		sc.close();

	}

}
