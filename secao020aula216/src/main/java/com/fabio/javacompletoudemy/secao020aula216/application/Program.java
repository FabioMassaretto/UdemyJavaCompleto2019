package com.fabio.javacompletoudemy.secao020aula216.application;

import com.fabio.javacompletoudemy.secao020aula216.domain.entity.Product;
import com.fabio.javacompletoudemy.secao020aula216.util.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.0));


        ProductService prodService = new ProductService();

        double sum = prodService.filtredSum(list, p -> p.getPrice() <= 100.0);

        System.out.println(" Sum: " + sum);
    }
}
