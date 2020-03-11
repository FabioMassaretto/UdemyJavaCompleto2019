package com.fabio.javacompletoudemy.secao020aula215.util;

import com.fabio.javacompletoudemy.secao020aula215.domain.entity.Product;

import java.util.function.Consumer;
import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
