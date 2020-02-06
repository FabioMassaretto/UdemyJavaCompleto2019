package com.fabio.javacompletoudemy.secao018aula189.domain.entity;

import java.util.Date;

public class Installment {
    private Date dueDate;
    private Double amount;

<<<<<<< HEAD
=======
    public Installment() {
    }

>>>>>>> cae748ec1f727c470a784c4fe7dc7565e094bb14
    public Installment(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

<<<<<<< HEAD
    public Double getAmount() {
        return amount;
    }
=======
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
>>>>>>> cae748ec1f727c470a784c4fe7dc7565e094bb14
}
