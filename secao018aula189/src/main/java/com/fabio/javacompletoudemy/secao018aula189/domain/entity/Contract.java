package com.fabio.javacompletoudemy.secao018aula189.domain.entity;

import java.util.Date;
import java.util.List;

public class Contract {
    private Integer number;
    private Date date;
    private Double totalvalue;
    private List<Installment> installment;

    public Contract(Integer number, Date date, Double totalvalue) {
        this.number = number;
        this.date = date;
        this.totalvalue = totalvalue;
    }

    public Integer getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }

    public Double getTotalvalue() {
        return totalvalue;
    }

    public List<Installment> getInstallment() {
        return installment;
    }
}
