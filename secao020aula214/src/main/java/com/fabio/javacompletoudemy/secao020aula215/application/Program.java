package com.fabio.javacompletoudemy.secao020aula215.application;

import com.fabio.javacompletoudemy.secao020aula215.domain.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.0));

        Double factor = 1.1;

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };

        //list.forEach(new PriceUpdate());
        //list.forEach(Product::nonStaticPriceUpdate);
        list.forEach( p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println);
    }
}
