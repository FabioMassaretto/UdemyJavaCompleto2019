package com.fabio.javacompletoudemy.secao008aula071.utils;

public class CurrencyConverter {
	private static final double IOF = 0.06;
	
	public static double dollarPrice;
	public static double dollarBought;
	
	public static double calculateAmount() {
		double amountPaid = getDollarPrice() * getDollarBought();
		return amountPaid + (amountPaid * IOF);
	}

	public static double getDollarPrice() {
		return dollarPrice;
	}

	public static double getDollarBought() {
		return dollarBought;
	}
	
}
