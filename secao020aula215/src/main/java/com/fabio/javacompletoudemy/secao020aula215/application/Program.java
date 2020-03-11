package com.fabio.javacompletoudemy.secao020aula215.application;

import com.fabio.javacompletoudemy.secao020aula215.domain.entity.Product;
import com.fabio.javacompletoudemy.secao020aula215.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.0));


        Function<Product, String> func = p -> p.getName().toUpperCase();

        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
