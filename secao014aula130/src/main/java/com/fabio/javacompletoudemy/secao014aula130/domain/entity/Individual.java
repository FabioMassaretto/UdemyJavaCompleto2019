package com.fabio.javacompletoudemy.secao014aula130.domain.entity;

public class Individual extends TaxPayers {
    private Double healthCosts;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualProfit, Double healthCosts) {
        super(name, anualProfit);
        this.healthCosts = healthCosts;
    }

    @Override
    public Double calcTax() {
        Double percentageTax =
                (super.anualProfit < 20000.00) ? 0.15 : 0.25;

        Double anualProfitWithTax =
                super.anualProfit * percentageTax;

        Double healthCostWithTax = 0.0;
        if(healthCosts > 0 && healthCosts != null) {
            healthCostWithTax = healthCosts * 0.50;
        }

        return anualProfitWithTax - healthCostWithTax;
    }
}
