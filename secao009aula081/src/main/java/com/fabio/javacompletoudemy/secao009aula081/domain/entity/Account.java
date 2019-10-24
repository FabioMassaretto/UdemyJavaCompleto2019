package com.fabio.javacompletoudemy.secao009aula081.domain.entity;

public class Account {
	private String name;
	private int accountNumber;
	private double balance;
	private static final double TAX_WITHDRAW = 5.00;
	
	public Account(String name, int accountNumber, double deposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		
		if(deposit > 0.0) {
			deposit(deposit);
		}
	}
	
	public void deposit(double value) {
		balance += value; 
	}
	
	public void withdraw(double value) {
		balance -= value + TAX_WITHDRAW;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public String toString() {
		return "Name: " + this.name + 
				", account number: " + this.accountNumber +
				", amount: $ " + String.format("%.2f", getBalance());
	}
	
}
