package com.fabio.javacompletoudemy.secao010aula089.application;

import com.fabio.javacompletoudemy.secao010aula089.domain.entity.Client;

import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao005aula071
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Client[] clientVector = new Client[10];
		
		System.out.print("");
		for (int i = 0; i < n; i++) {
			System.out.printf("Rent#%d%n", i+1);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			if(clientVector[room] == null) {
				clientVector[room] = new Client(name, email, room);
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("Busy rooms:");
		for (int i = 0; i < clientVector.length; i++) {
			if(clientVector[i] != null) {
				System.out.printf("%d: %s, %s %n", 
						clientVector[i].getRoom(), 
						clientVector[i].getName(), 
						clientVector[i].getEmail());
			}
		}
		
		
		sc.close();

	}

}
