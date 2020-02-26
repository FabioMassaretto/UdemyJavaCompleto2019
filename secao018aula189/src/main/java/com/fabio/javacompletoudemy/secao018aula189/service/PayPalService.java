package com.fabio.javacompletoudemy.secao018aula189.service;

public class PayPalService implements PaymentService {
    @Override
    public double monthlyInterest(double value) {
        return 0;
    }

    @Override
    public double fee(double value) {
        return 0;
    }

    @Override
    public Double calculateTax(Double amount) {
        return null;
    }
}
