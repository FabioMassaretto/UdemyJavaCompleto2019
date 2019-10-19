package com.fabio.javacompletoudemy.secao008aula067.application;

import com.fabio.javacompletoudemy.secao008aula067.domain.Product;

import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao004aula056
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.print("Enter the number of product to be added in stock: ");
        quantity = sc.nextInt();
        product.addQuantity(quantity);
        System.out.println(product);
        System.out.println();

        System.out.println();
        System.out.print("Enter the number of product to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeQuantity(quantity);
        System.out.println(product);

        System.out.println();
        sc.close();
    }
}
