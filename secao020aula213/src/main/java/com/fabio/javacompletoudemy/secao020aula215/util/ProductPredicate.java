package com.fabio.javacompletoudemy.secao020aula215.util;

import com.fabio.javacompletoudemy.secao020aula215.domain.entity.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
