package com.fabio.javacompletoudemy.secao014aula123.application;

import com.fabio.javacompletoudemy.secao014aula123.domain.entity.Account;
import com.fabio.javacompletoudemy.secao014aula123.domain.entity.BusinessAccount;
import com.fabio.javacompletoudemy.secao014aula123.domain.entity.SavingsAccount;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao009aula105
public class Program {

	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Maria", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Joao", 1000.0, 0.02);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
