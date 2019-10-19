package com.fabio.javacompletoudemy.secao015aula141.application;

import com.fabio.javacompletoudemy.secao015aula141.domain.entity.Account;
import com.fabio.javacompletoudemy.secao015aula141.domain.exception.DomainException;

import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao010aula123
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number;
        String holder;
        Double balance;
        Double withdrawLimit;
        Double amountWithdraw;

        System.out.println("Enter account data");
        System.out.print("Number: ");
        number = sc.nextInt();

        System.out.print("Holder: ");
        holder = sc.nextLine();
        sc.next();

        System.out.print("Initial balance: ");
        balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        amountWithdraw = sc.nextDouble();

        try {
            account.withdraw(amountWithdraw);

            System.out.println("New balance: " + account.getBalance());
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
