package com.fabio.javacompletoudemy.secao008aula071.application;

import com.fabio.javacompletoudemy.secao008aula071.utils.CurrencyConverter;

import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao003aula053
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();

        System.out.println("How many dollar will be bought? ");
        CurrencyConverter.dollarBought = sc.nextDouble();

        double amount = CurrencyConverter.calculateAmount();

        System.out.println("Amount to be paid in Reais: " + amount);

        sc.close();
    }
}
