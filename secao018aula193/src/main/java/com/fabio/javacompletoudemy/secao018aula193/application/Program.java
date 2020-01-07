package com.fabio.javacompletoudemy.secao018aula193.application;

import com.fabio.javacompletoudemy.secao018aula193.service.InterestService;
import com.fabio.javacompletoudemy.secao018aula193.service.UsaInterestService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        Double amount = sc.nextDouble();
        System.out.println("Months");
        Integer months = sc.nextInt();

        InterestService is = new UsaInterestService(1.0);
        Double payment = is.payment(amount, months);

        System.out.println("Payment after: " + months + " months:");
        System.out.println(String.format("%.2f", payment));
    }
}
