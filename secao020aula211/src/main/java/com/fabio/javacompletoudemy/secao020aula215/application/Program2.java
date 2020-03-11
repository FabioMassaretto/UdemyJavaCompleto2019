package com.fabio.javacompletoudemy.secao020aula215.application;

import com.fabio.javacompletoudemy.secao020aula215.domain.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static int compareProducts(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        list.sort(Program2::compareProducts);

        list.forEach(System.out::println);
    }
}
