package com.fabio.javacompletoudemy.secao018aula189.domain.entity;

import java.util.Date;
import java.util.List;

public class Contract {
    private Integer number;
    private Date date;
<<<<<<< HEAD
    private Double totalvalue;
    private List<Installment> installment;

    public Contract(Integer number, Date date, Double totalvalue) {
        this.number = number;
        this.date = date;
        this.totalvalue = totalvalue;
=======
    private Double totalValue;
    private List<Installment> installment;

    public Contract() {
    }

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
>>>>>>> cae748ec1f727c470a784c4fe7dc7565e094bb14
    }

    public Integer getNumber() {
        return number;
    }

<<<<<<< HEAD
=======
    public void setNumber(Integer number) {
        this.number = number;
    }

>>>>>>> cae748ec1f727c470a784c4fe7dc7565e094bb14
    public Date getDate() {
        return date;
    }

<<<<<<< HEAD
    public Double getTotalvalue() {
        return totalvalue;
=======
    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
>>>>>>> cae748ec1f727c470a784c4fe7dc7565e094bb14
    }

    public List<Installment> getInstallment() {
        return installment;
    }
<<<<<<< HEAD
=======

    public void setInstallment(List<Installment> installment) {
        this.installment = installment;
    }
>>>>>>> cae748ec1f727c470a784c4fe7dc7565e094bb14
}
