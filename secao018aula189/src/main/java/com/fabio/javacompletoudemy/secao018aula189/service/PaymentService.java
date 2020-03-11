package com.fabio.javacompletoudemy.secao018aula189.service;

public interface PaymentService {

    double monthlyInterest(double value, int month);
    double fee(double value);

    Double calculateTax(Double amount, Integer month);

}
