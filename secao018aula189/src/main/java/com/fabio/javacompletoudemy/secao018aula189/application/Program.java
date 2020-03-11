package com.fabio.javacompletoudemy.secao018aula189.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        Integer numger = sc.nextInt();

        System.out.print("Date (dd/MM/yyyy): ");
        sc.nextLine();
        String strDate = sc.nextLine();
        LocalDate date = LocalDate.from(dtf.parse(strDate));

        System.out.print("Contract value: ");
        Double amount = sc.nextDouble();

        System.out.print("Enter number of installments: ");
        Integer instalmments = sc.nextInt();

        System.out.println("Installments: ");
    }
}
