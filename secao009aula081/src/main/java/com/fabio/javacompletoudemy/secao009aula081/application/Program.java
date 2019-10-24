package com.fabio.javacompletoudemy.secao009aula081.application;

import com.fabio.javacompletoudemy.secao009aula081.domain.entity.Account;

import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao004aula062
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter the account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Do you wish make a deposit? (y/n) ");
		char makeDeposit = sc.next().charAt(0);
		
		boolean response = makeDeposit == 'y' ? true : false;
		double amount = 0.0;
		
		if(response) {
			System.out.println("Enter tha value you would like to deposit: ");
			amount = sc.nextDouble();
		}
		
		Account account = new Account(name, accountNumber, amount);
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a value to deposit: ");
		amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a value to withdraw: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println(account);
				
		
		sc.close();

	}

}
