package Udemy.CursoJava.Udemy.Exercicios.Interfaces.ProcessContratc.Model.service;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interest(double amount, int months);

}
