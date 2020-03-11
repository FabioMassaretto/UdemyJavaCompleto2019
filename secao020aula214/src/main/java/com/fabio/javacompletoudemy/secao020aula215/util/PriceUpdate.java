package com.fabio.javacompletoudemy.secao020aula215.util;

import com.fabio.javacompletoudemy.secao020aula215.domain.entity.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
