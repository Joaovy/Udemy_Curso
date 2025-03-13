package Udemy.CursoJava.Udemy.Exercicios.Interfaces.ProcessContratc.Model.entities;

import java.util.Date;

// Installement = parcelamento
// dueDate = date de vencimento
// amount = quantia
public class Installment {

    private Date dueDate;
    private double amount;


    public Installment(Date dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
