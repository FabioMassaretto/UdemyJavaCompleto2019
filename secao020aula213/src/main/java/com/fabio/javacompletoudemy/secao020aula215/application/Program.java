package com.fabio.javacompletoudemy.secao020aula215.application;

import com.fabio.javacompletoudemy.secao020aula215.domain.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.0));

        Predicate<Product> pred = x -> x.getPrice() >= 100.0;

        //list.removeIf(Product::nonStaticProductPredicate);
        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
