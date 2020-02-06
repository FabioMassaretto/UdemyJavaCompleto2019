package com.fabio.javacompletoudemy.secao018aula189.service;

public class PaypalService implements PaymentService{

    @Override
    public double monthlyInterest(double amount) {
        amount += (amount * 0.01);
        return amount;
    }

    @Override
    public double fee(double amount) {
        amount += (amount * 0.02);
        return amount;
    }
}
