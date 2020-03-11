package com.fabio.javacompletoudemy.secao020aula216.util;

import com.fabio.javacompletoudemy.secao020aula216.domain.entity.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public Double filtredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product p : list) {
            if(criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
