package com.fabio.javacompletoudemy.secao020aula210.application;

import com.fabio.javacompletoudemy.secao020aula210.domain.entity.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        //Comparator<Product> comp = (p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase());

        //list.sort(new MyComparator());
        // or
        list.sort((p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
