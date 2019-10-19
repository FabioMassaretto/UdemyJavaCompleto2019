package com.fabio.javacompletoudemy.secao014aula130.domain.entity;

public abstract class TaxPayers {
    protected String name;
    protected Double anualProfit;

    public TaxPayers() {
    }

    public TaxPayers(String name, Double anualProfit) {
        this.name = name;
        this.anualProfit = anualProfit;
    }

    public abstract Double calcTax();

    public String getName() {
        return name;
    }
}
