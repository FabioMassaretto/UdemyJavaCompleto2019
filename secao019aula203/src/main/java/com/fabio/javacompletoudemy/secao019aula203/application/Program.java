package com.fabio.javacompletoudemy.secao019aula203.application;

import com.fabio.javacompletoudemy.secao019aula203.domain.entity.Product;

import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 1200.00));
        set.add(new Product("Notebook", 2400.00));
        set.add(new Product("Tablet", 400.00));


        for(Product p : set){
            System.out.println(p.toString());
        }
    }
}
