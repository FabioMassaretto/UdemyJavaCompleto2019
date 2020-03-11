package com.fabio.javacompletoudemy.secao020aula210.application;

import com.fabio.javacompletoudemy.secao020aula210.domain.entity.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase());
    }
}
