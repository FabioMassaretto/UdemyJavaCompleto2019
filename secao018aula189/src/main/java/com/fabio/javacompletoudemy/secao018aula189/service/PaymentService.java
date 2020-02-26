package com.fabio.javacompletoudemy.secao018aula189.service;

public interface PaymentService {

    double monthlyInterest(double value);
    double fee(double value);

    Double calculateTax(Double amount);

}
