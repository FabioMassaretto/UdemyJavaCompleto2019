package com.fabio.javacompletoudemy.secao018aula189.service;

public class InstallmentService {

    private PaymentService paymentService;

    public InstallmentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public double getInstallments(){
        return 0.0;
    }
}
