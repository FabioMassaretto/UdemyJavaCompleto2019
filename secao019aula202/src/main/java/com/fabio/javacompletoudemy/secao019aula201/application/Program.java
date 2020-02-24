package com.fabio.javacompletoudemy.secao019aula201.application;

import com.fabio.javacompletoudemy.secao019aula201.domain.entiry.Product;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        final Object exception = new Exception();
        final Exception data = (RuntimeException)exception;
        System.out.print(data);
        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.00));
        set.add(new Product("Notebook", 1200.00));
        set.add(new Product("Tablet", 400.00));

        Product prod = new Product("Notebook", 1200.00);

        System.out.println(set.contains(prod));
    }
}
