package com.fabio.javacompletoudemy.secao018aula189.service;

public class PayPalService implements PaymentService{

    @Override
    public Double calculateTax(Double amount) {
        return (amount + (amount * 0.01)) + (amount + (amount * 0.02));
    }
}
