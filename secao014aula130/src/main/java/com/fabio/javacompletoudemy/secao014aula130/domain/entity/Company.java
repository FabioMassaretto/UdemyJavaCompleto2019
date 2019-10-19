package com.fabio.javacompletoudemy.secao014aula130.domain.entity;

public class Company extends TaxPayers{
    private Integer employeesNumber;

    public Company(String name, Double anualProfit, Integer employeesNumber) {
        super(name, anualProfit);
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double calcTax() {
        Double tax =
                this.employeesNumber > 10 ? 0.14 : 0.16;
        return super.anualProfit * tax;
    }
}
