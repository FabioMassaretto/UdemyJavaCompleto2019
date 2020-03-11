package com.fabio.javacompletoudemy.secao018aula189.service;

public class PayPalService implements PaymentService {
    @Override
    public double monthlyInterest(double value, int month) {
        return value + (value * 0.01 * month);
    }

    @Override
    public double fee(double value) {
        return value + (value * 0.02);
    }

    @Override
    public Double calculateTax(Double amount, Integer month) {
        return monthlyInterest(amount, month) + fee(amount);
    }
}
