package com.fabio.javacompletoudemy.secao014aula130.application;

import com.fabio.javacompletoudemy.secao014aula130.domain.entity.Company;
import com.fabio.javacompletoudemy.secao014aula130.domain.entity.Individual;
import com.fabio.javacompletoudemy.secao014aula130.domain.entity.TaxPayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao009aula112
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int numberTaxPayers = sc.nextInt();

        List<TaxPayers> listTaxPayers = new ArrayList<>();
        for (int i = 1; i <= numberTaxPayers; i++) {
            System.out.printf("Tax Payer #%d data: %n", i);

            sc.nextLine();
            System.out.print("Individual or Company (i/c)");
            char type = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if(type == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                listTaxPayers.add(
                        new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of Employees: ");
                Integer numberEmployees = sc.nextInt();
                listTaxPayers.add(
                        new Company(name, anualIncome, numberEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        Double totalTaxes = 0.0;
        for(TaxPayers taxPayer : listTaxPayers) {
            System.out.printf("%s: $ %.2f %n",
                    taxPayer.getName(),
                    taxPayer.calcTax());
            totalTaxes += taxPayer.calcTax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: %.2f", totalTaxes);
    }
}
