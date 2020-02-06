package com.fabio.javacompletoudemy.secao018aula193.service;

public class BrazilInterestService implements InterestService {
    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }
}
